package com.github.coderpreacher.vos.reqs;

import lombok.Data;

@Data
public class QueryKeywordReq {
    private Integer KeywordType = 4;
    private String Extend = "";
    private Integer ExtendType = 3;
    private Integer PageIndex = 1;
    private Integer PageSize = 40;
    private Sort Sorts = new Sort();
    private Integer Sponsored = 2;
    private String VariantType = "1,2,3,4,5,6,7,8,9";
    private Integer BusySeason;
    private Integer IsFrequency = 1;
    private String FrequencyKeyword = "";
    private Boolean IsQueryAsin = true;
    private Boolean underclass = true;
    private Boolean mergeVariant = false;
    private String NodeId;
    private Integer KeywordsId = 0;
    private String Site;
    private String Topnode = "ZmFzaGlvbg==";
    private String SearchAsinStr = "";
    private Integer ChartType = 0;
    private Integer LbTag = 0;
    private String LbStartDate = "1970-01-01";
    private Integer LbCategory = 0;
    private String ProductId = "";
    private Boolean CustomColor = true;
    private String AsinStr = "";
    private String sourcePageCode = "0003";
    private Integer nmversion = 46;

    @Data
    public static class Sort {
        private Integer Top = 0;
    }
}
