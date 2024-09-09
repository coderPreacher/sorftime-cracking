package com.github.coderpreacher.vos.reqs;

import lombok.Data;

import java.util.List;

@Data
public class DownloadPageResp<T> {
    private List<T> DownloadUsers;
    private Integer PageIndex;
    private Integer PageSize;
    private Long TotalCount;
    private Integer PageCount;
}
