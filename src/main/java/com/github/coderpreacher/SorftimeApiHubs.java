package com.github.coderpreacher;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.github.coderpreacher.enums.AmazonSiteEnum;
import com.github.coderpreacher.utils.SorftimeUtil;
import com.github.coderpreacher.vos.SorftimeApiResp;
import com.github.coderpreacher.vos.reqs.*;
import okhttp3.*;

import java.net.SocketException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SorftimeApiHubs {
    public static final String SORFTIME_ACCESS_TOKEN_KEY = "sorftime:access:token";
    public static final String SORFTIME_DES_IV_KEY = "sorftime:des:iv:key";
    private static final Map<String, String> CACHE = new HashMap<>(2);
    private static final Logger log = Logger.getLogger(SorftimeApiHubs.class.getName());

    public static List<KeyWordBoardResp> queryKeywordBoard(String site, String nodeId) {
        AmazonSiteEnum amazonSiteEnum = AmazonSiteEnum.matchNullFail(site);
        KeywordReq keywordReq = new KeywordReq();
        keywordReq.setSite(amazonSiteEnum.getSorftimeSiteId());
        keywordReq.setExtend(nodeId);
        List<KeyWordBoardResp> keyWordBoardRespList = CollUtil.newArrayList();
        String url = String.format("https://api.sorftime.com/api/keywordboard/querykeywordboard?site=%s", keywordReq.getSite());
        int currentPage = 1;
        int totalPages;
        while (true) {
            keywordReq.setPageIndex(currentPage);
            keywordReq.setPageSize(40);
            SorftimeApiResp<KeywordPageResp<KeyWordBoardResp>> keyWordBoardPageResp = buildRequest(url, keywordReq.getSite(), keywordReq, new TypeReference<>() {
            });
            totalPages = keyWordBoardPageResp.getData().getPageCount();
            List<KeyWordBoardResp> resp = keyWordBoardPageResp.getData().getData();
            if (CollUtil.isEmpty(resp)) {
                break;
            }
            keyWordBoardRespList.addAll(resp);
            if (totalPages == currentPage) {
                break;
            }
            currentPage++;
            ThreadUtil.safeSleep(1000);
        }
        return keyWordBoardRespList;
    }

    public static List<CategoryNameResp> querySiteCategory(AmazonSiteEnum amazonSiteEnum, Long parentId) {
        try {
            SiteCategoryReq keywordReq = new SiteCategoryReq();
            keywordReq.setParentId(parentId);
            keywordReq.setSortTemNode("");
            keywordReq.setTopnodestr("");
            keywordReq.setTopnodecheckstr("");
            keywordReq.setExpres(1);
            keywordReq.setMarketType(1);
            keywordReq.setProductType(1);
            keywordReq.setHistoryLookTime("");
            keywordReq.setSite(amazonSiteEnum.getSorftimeSiteId());
            String url = String.format("https://api.sorftime.com/api/bestseller/nodeidtree?site=%s", keywordReq.getSite());
            SorftimeApiResp<List<CategoryNameResp>> r2 = buildRequest(url, keywordReq.getSite(), keywordReq, new TypeReference<>() {
            });
            System.out.println(JSONUtil.toJsonStr(r2));
            ThreadUtil.safeSleep(2000);
            return r2.getData();
        } catch (Exception e) {
            log.warning("获取站点" + amazonSiteEnum.getValue() + "类目中文名称异常" + e.getMessage());
        }
        return new ArrayList<>();


    }
    public static <R> R buildRequest(String url, String site, Object params, TypeReference<R> typeReference) {
        boolean emptyToken = url.contains("dologinbysubpwd") || url.contains("getscerts");
        int count = 0;
        while (true) {
            try {
                count++;
                OkHttpClient client = new OkHttpClient()
                        .newBuilder()
                        .connectTimeout(10, TimeUnit.SECONDS)
                        .writeTimeout(10, TimeUnit.SECONDS)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .build();
                MediaType mediaType = MediaType.parse("application/json");
                String paramsStr = JSON.toJSONString(params);
                RequestBody body = RequestBody.create(mediaType, paramsStr);
                SorftimeUtil.HeaderKey headerKey = SorftimeUtil.buildHeaderKey();
                Request.Builder builder = new Request.Builder()
                        .url(url)
                        .post(body)
                        .addHeader("Accept", "application/json, text/plain, */*")
                        .addHeader("Accept-Language", "zh-CN")
                        .addHeader("AuthProvider", "2")
                        .addHeader("Bv", "5.0")
                        .addHeader("Connection", "keep-alive")
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Origin", "https://seller.sorftime.com")
                        .addHeader("Owner", site)
                        .addHeader("Referer", "https://seller.sorftime.com/")
                        .addHeader("Sec-Fetch-Dest", "empty")
                        .addHeader("Sec-Fetch-Mode", "cors")
                        .addHeader("Sec-Fetch-Site", "same-site")
                        .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36")
                        .addHeader("en-code", headerKey.en_code)
                        .addHeader("en-key", headerKey.en_key)
                        .addHeader("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126\"")
                        .addHeader("sec-ch-ua-mobile", "?0")
                        .addHeader("sec-ch-ua-platform", "\"Windows\"");
                if (!emptyToken) {
                    builder.addHeader("Authorization", "BasicAuth " + getAccessToken());
                }
                Request request = builder.build();
                try (Response response = client.newCall(request).execute()) {
                    if (response.code() == 401 || response.code() == 403) {
                        log.warning("sorftime接口401");
                        // 401说明token过期了
                        expiredToken();
                        throw new SorftimeException();
                    }
                    if (!response.isSuccessful() || Objects.isNull(response.body())) {
                        log.warning("Unexpected code " + response);
                        throw new RuntimeException();
                    }
                    String resText = response.body().string();
                    // 如果是获取iv 无需解密
                    if (url.contains("getscerts")) {
                        return JSON.parseObject(resText, typeReference);
                    }
                    JSONObject jsonObject = JSON.parseObject(resText);
                    String d = jsonObject.getString("d");
                    String k = jsonObject.getString("k");
                    String iv = getDecryptIv(AmazonSiteEnum.US.getSorftimeSiteId());
                    String json = SorftimeUtil.proDecrypt(d, k, iv);
                    SorftimeApiResp<?> sorftimeApiResp = JSON.parseObject(json, SorftimeApiResp.class);
                    if (!sorftimeApiResp.isSuccessFul()) {
                        log.warning("sorftime接口失败: " + sorftimeApiResp.getMessage());
                        log.info("json = {}" + json);
                        throw new SorftimeException();
                    }
                    return JSON.parseObject(json, typeReference);
                } catch (SocketException | SorftimeException e) {
                    log.warning(e.getMessage() + e.getMessage());
                    if (count > 3) {
                        throw new RuntimeException(e);
                    }
                } catch (Exception e) {
                    log.warning("sorftime接口异常" + e.getMessage());
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void expiredToken() {
        CACHE.remove(SORFTIME_ACCESS_TOKEN_KEY);
        CACHE.remove(SORFTIME_DES_IV_KEY);
    }

    private static String getDecryptIv(String site) {
        String iv = CACHE.get(SORFTIME_DES_IV_KEY);
        if (Objects.isNull(iv)) {
            log.info("refreshIvKey");
            return refreshIvKey(site);
        }
        return iv;
    }

    private static String getAccessToken() {
        String accessToken = CACHE.get(SORFTIME_ACCESS_TOKEN_KEY);
        if (Objects.isNull(accessToken)) {
            log.info("refreshToken");
            accessToken = refreshToken();
        }
        return accessToken;
    }

    private static String refreshIvKey(String site) {
        Map<String, String> siteParams = new HashMap<>(1);
        siteParams.put("site", site);
        // 获取新的解密iv
        IvKeyResp ivResp = buildRequest("https://api.sorftime.com/api/uc/getscerts?site=01", site, siteParams, new TypeReference<IvKeyResp>() {
        });
        // 缓存解密iv
        log.info("refreshIvKey = " +ivResp.getIv());
        CACHE.put(SORFTIME_DES_IV_KEY, ivResp.getIv());
        return ivResp.getIv();
    }
    private static String refreshToken() {
        expiredToken();
        LoginReq loginReq = new LoginReq();
        loginReq.setSite(AmazonSiteEnum.US.getSorftimeSiteId());
        // 这里输入sorftime账号
        loginReq.setSubName("");
        loginReq.setSubPwd("");
        // 重新登录
        SorftimeApiResp<LoginResp> loginResp = buildRequest("https://api.sorftime.com/api/uc/dologinbysubpwd?site=01", loginReq.getSite(), loginReq, new TypeReference<SorftimeApiResp<LoginResp>>() {
        });
        log.info("refreshToken = "  + loginResp.getData().getAccessToken());
        // 缓存token
        CACHE.put(SORFTIME_ACCESS_TOKEN_KEY, loginResp.getData().getAccessToken());
        // 刷新iv
        refreshIvKey(loginReq.getSite());
        return loginResp.getData().getAccessToken();
    }
}