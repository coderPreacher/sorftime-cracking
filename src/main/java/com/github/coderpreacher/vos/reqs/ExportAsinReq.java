package com.github.coderpreacher.vos.reqs;


import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.List;

@Data
public class ExportAsinReq {
    private String NodeIdStr;
    private String KeywordsIdStr = "";
    private Integer ChartType = 0;
    private String Brand = "";
    private String Seller = "";
    private Integer ReportType = 1;
    private Integer ReportNodeRange = 1;
    private Integer Type = 0;
    private Integer LbTag = 1;
    private String LbStartDate;
    private Integer LbCategory = 29;
    private String Asin = "";
    private String Symbol = "$";
    private String WeightUnit = "(lb)";
    private String VolumeUnit = "(in³)";
    private String TemplateType = "zh-CN";
    private List<Integer> ExportOption = CollUtil.newArrayList(1, 2, 3);
    private List<String> CheckAsinArr = CollUtil.newArrayList();
    private String ExportType = "1";
    private Integer UseCount = 1;
    private Integer Istop400Dc = 0;
    private Boolean mergeVariant = false;
    private Boolean productTypeShow = true;
    private String productTypeFromKP = "";
    private Integer type = 1;
    private String beginKeyWordRank = "";
    private String endKeyWordRank = "";
    private String beginSelDate = "";
    private String endSelDate = "";
    private String beginSaleCount = "";
    private String endSaleCount = "";
    private String beginSaleCountRank = "";
    private String endSaleCountRank = "";
    private String beginSaleEstimate = "";
    private String endSaleEstimate = "";
    private String beginPrice = "";
    private String endPrice = "";
    private String beginCommentCount = "";
    private String endCommentCount = "";
    private String beginScore = "";
    private String endScore = "";
    private String beginRank = "";
    private String endRank = "";
    private String beginOtherSellerCount = "";
    private String endOtherSellerCount = "";
    private String beginFBAFee = "";
    private String endFBAFee = "";
    private String beginDeliveryFree = "";
    private String endDeliveryFree = "";
    private String beginShippingWeight = "";
    private String endShippingWeight = "";
    private String beginShippingVolume = "";
    private String endShippingVolume = "";
    private Integer isFBAFBM = 0;
    private Integer isEBC = 0;
    private Integer isClimatePF = 3;
    private Integer isSolder = 0;
    private String containName = "";
    private String removeName = "";
    private String solderNationalityCode = "";
    private String sizeTagStr = "";
    private String beginSolderDp = "";
    private Integer regTrademark = 0;
    private Integer isThrowGoods = 0;
    private Integer removeType = 0;
    private Integer containType = 0;
    private String orderType = "desc";
    private String orderSort = "SaleCount";
    private Integer Variants = 0;
    private Integer isExistsVideo = 0;
    private Integer brandFlagship = 0;
    private Integer sponsored = 1;
    private Integer isTightInventoryType = 1;
    private Integer isOutStockType = 1;
    private String site = "01";
}
