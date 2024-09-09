package com.github.coderpreacher.vos.reqs;

import lombok.Data;

import java.util.List;

@Data
public class KeywordPageResp<T> {
    private List<T> Data;
    private Integer PageIndex;
    private Integer PageSize;
    private Long TotalCount;
    private Integer PageCount;
    private List<String> queryKeywords;
    private Integer Isbottom;
}
