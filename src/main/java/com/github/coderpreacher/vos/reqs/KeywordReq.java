package com.github.coderpreacher.vos.reqs;

import lombok.Data;

/**
 * {
 *     "KeywordType": 4,
 *     "SearchType": 0,
 *     "Extend": "370094011",
 *     "ExtendType": 3,
 *     "Sorts": {
 *         "Top": 0
 *     },
 *     "CommentType": 1,
 *     "ScoreType": 1,
 *     "NewType": 1,
 *     "OPLRRateType": 1,
 *     "APLRRateType": 1,
 *     "Sponsored": 2,
 *     "VariantType": "1,2,3,4,5,6,7,8,9",
 *     "BusySeason": 0,
 *     "SearchPage": 1,
 *     "FrequencyKeyword": "",
 *     "PageIndex": 1,
 *     "PageSize": 20,
 *     "IsFrequency": 1,
 *     "IsQueryAsin": true,
 *     "site": "01"
 * }
 */
@Data
public class KeywordReq {
    private Integer KeywordType = 4;
    private Integer SearchType = 0;
    // 类目ID
    private String Extend = "";
    private Integer ExtendType = 3;
    private QueryKeywordReq.Sort Sorts = new QueryKeywordReq.Sort();
    private Integer CommentType = 1;
    private Integer ScoreType = 1;
    private Integer NewType = 1;
    private Integer OPLRRateType = 1;
    private Integer APLRRateType = 1;
    private Integer Sponsored = 2;
    private String VariantType = "1,2,3,4,5,6,7,8,9";
    private Integer BusySeason = 0;
    private Integer SearchPage = 1;
    private String FrequencyKeyword = "";
    private Integer PageIndex = 1;
    private Integer PageSize = 40;
    private Integer IsFrequency = 1;
    private Boolean IsQueryAsin = true;
    private String site;





    @Data
    public static class Sort {
        private Integer Top = 0;
    }
}
