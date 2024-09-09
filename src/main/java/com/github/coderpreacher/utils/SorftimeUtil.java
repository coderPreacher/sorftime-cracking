package com.github.coderpreacher.utils;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.compress.utils.IOUtils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.zip.GZIPInputStream;

/**
 * 亚马逊三方插件 Sorftime数据解密工具类
 *
 * @author xiehui
 */
public class SorftimeUtil {

    /**
     * sorftime 插件接口解密
     *
     * @param ciphertext 密文
     * @param key        key
     */
    public static String pluginDecrypt(String ciphertext, String key) throws GeneralSecurityException, IOException {
        // 生成MD5哈希和初始化向量
        String r = Base64.encodeBase64String(DigestUtils.md5(key.getBytes(StandardCharsets.UTF_8)))
                .substring(2, 10);

        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        byte[] ivBytes = r.getBytes(StandardCharsets.UTF_8);
        byte[] encryptedData = Base64.decodeBase64(ciphertext);

        // 解密数据
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(new DESKeySpec(keyBytes));
        cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(ivBytes));
        byte[] decryptedData = cipher.doFinal(encryptedData);
        // 检查解密后的数据
        System.out.println("解密后的数据长度: " + decryptedData.length);
        // 解压
        return decompress(decryptedData);
    }

    /**
     * sorftime 专业版接口解密
     *
     * @param ciphertext 密文
     * @param key        key
     * @param iv         解密向量
     */
    public static String proDecrypt(String ciphertext, String key, String iv) throws GeneralSecurityException, IOException {
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);
        byte[] ivBytes = iv.getBytes(StandardCharsets.UTF_8);
        byte[] encryptedData = Base64.decodeBase64(ciphertext);

        // 解密数据
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(new DESKeySpec(keyBytes));
        cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(ivBytes));
        byte[] decryptedData = cipher.doFinal(encryptedData);
        // 检查解密后的数据
        System.out.println("解密后的数据长度: " + decryptedData.length);
        // 解压
        return decompress(decryptedData);
    }

    public static String decompress(final byte[] compressed) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(compressed);
        GZIPInputStream gis = new GZIPInputStream(bis);
        byte[] bytes = IOUtils.toByteArray(gis);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static class HeaderKey {
        public String en_key;
        public String en_code;

        public HeaderKey(String en_key, String en_code) {
            this.en_key = en_key;
            this.en_code = en_code;
        }

        @Override
        public String toString() {
            return "HeaderKey{" +
                    "en_key='" + en_key + '\'' +
                    ", en_code='" + en_code + '\'' +
                    '}';
        }
    }

    public static HeaderKey buildHeaderKey() {
        String currentTimeMillis = Long.toString(System.currentTimeMillis());
        // 截取前8个字符
        String en_key = currentTimeMillis.substring(0, 8);
        // 生成初始化向量
        String iv = Base64.encodeBase64String(DigestUtils.md5(en_key.getBytes(StandardCharsets.UTF_8))).substring(0, 8);
        // 创建加密密钥和初始化向量
        SecretKeySpec keySpec = new SecretKeySpec(en_key.getBytes(StandardCharsets.UTF_8), "DES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8));
        // 初始化加密器
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
            // 加密数据
            byte[] encrypted = cipher.doFinal(en_key.getBytes(StandardCharsets.UTF_8));
            String en_code = Base64.encodeBase64String(encrypted);
            System.out.println("en_key = " + en_key + " en_code = " + en_code);
            return new HeaderKey(en_key, en_code);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
