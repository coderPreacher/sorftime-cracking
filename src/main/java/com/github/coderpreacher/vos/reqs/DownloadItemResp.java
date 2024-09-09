package com.github.coderpreacher.vos.reqs;

import lombok.Data;

@Data
public class DownloadItemResp {

    private Integer Istop400Dc;

    private String IgnoreProductsAsinList;

    private String CheckAsinStr;

    private Integer BatchId;

    private Integer Id;

    private Integer CustomerId;

    private String Url;

    private String CreateTime;

    private Integer Status;

    private Integer Type;

    private String Key;

    private Integer Count;

    private String MqMsg;

    private String FileName;

    private Integer Platform;

    private Integer ErrorCode;

    private String TaskBeginTime;

    private Integer RetryCount;

    private Integer TaskFinishTime;

    private Integer IsDownload;

    private String nodeId;


    public String getNodeId() {
        return this.getFileName().split("_")[1];
    }
}
