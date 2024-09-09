package com.github.coderpreacher.vos;

import lombok.Data;

@Data
public class SorftimeApiResp<TData> {
    public static final String SUCCESS_MESSAGE = "Success";
    public static final Integer SUCCESS_CODE = 0;

    private Integer Code;
    private String Message;
    private TData Data;


    public Boolean isSuccessFul() {
        return Code.equals(SUCCESS_CODE);
    }

}
