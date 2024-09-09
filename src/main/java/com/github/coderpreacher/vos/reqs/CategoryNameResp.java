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
public class CategoryNameResp {

    /**
     * isParent
     */
    @JsonProperty("isParent")
    private Boolean isParent;
    /**
     * excludeNodeIDTag
     */
    @JsonProperty("ExcludeNodeIDTag")
    private Integer excludeNodeIDTag;
    /**
     * topNodeId
     */
    @JsonProperty("TopNodeId")
    private String topNodeId;
    /**
     * saleCount
     */
    @JsonProperty("SaleCount")
    private Integer saleCount;
    /**
     * pId
     */
    @JsonProperty("pId")
    private Integer pId;
    /**
     * url
     */
    @JsonProperty("Url")
    private String url;
    /**
     * scmNodeName
     */
    @JsonProperty("ScmNodeName")
    private String scmNodeName;
    /**
     * scmTag
     */
    @JsonProperty("ScmTag")
    private Integer scmTag;
    /**
     * nodeId
     */
    @JsonProperty("NodeId")
    private String nodeId;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * childCount
     */
    @JsonProperty("ChildCount")
    private Integer childCount;
    /**
     * cartCount
     */
    @JsonProperty("CartCount")
    private Integer cartCount;
    /**
     * brandCount
     */
    @JsonProperty("BrandCount")
    private Integer brandCount;
    /**
     * checked
     */
    @JsonProperty("checked")
    private Boolean checked;
    /**
     * halfCheck
     */
    @JsonProperty("halfCheck")
    private Boolean halfCheck;
    /**
     * id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * nameEncode
     */
    @JsonProperty("NameEncode")
    private String nameEncode;
}
