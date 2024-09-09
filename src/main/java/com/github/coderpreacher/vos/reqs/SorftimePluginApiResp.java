package com.github.coderpreacher.vos.reqs;

import lombok.Data;

@Data
public class SorftimePluginApiResp {
    public static final String SUCCESS_MESSAGE = "Success";
    public static final Integer SUCCESS_CODE = 0;

    private Integer ResultID;
    private String ResultMessage;
    private String Data;


    public Boolean isSuccessFul() {
        return ResultMessage.equals(SUCCESS_MESSAGE);
    }

}
