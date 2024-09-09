package com.github.coderpreacher.vos.reqs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 黄俊伟
 * @copyright Copyright (C) 2022 PatPat, Inc. All rights reserved. <br>
 **/
@NoArgsConstructor
@Data
public class SiteCategoryReq {
    /**
     * parentId
     */
    @JsonProperty("ParentId")
    private Long parentId;
    /**
     * sortTemNode
     */
    @JsonProperty("SortTemNode")
    private String sortTemNode;
    /**
     * topnodestr
     */
    @JsonProperty("Topnodestr")
    private String topnodestr;
    /**
     * topnodecheckstr
     */
    @JsonProperty("Topnodecheckstr")
    private String topnodecheckstr;
    /**
     * expres
     */
    @JsonProperty("Expres")
    private Integer expres;
    /**
     * marketType
     */
    @JsonProperty("MarketType")
    private Integer marketType;
    /**
     * productType
     */
    @JsonProperty("ProductType")
    private Integer productType;
    /**
     * historyLookTime
     */
    @JsonProperty("HistoryLookTime")
    private String historyLookTime;
    /**
     * site
     */
    @JsonProperty("site")
    private String site;
}
