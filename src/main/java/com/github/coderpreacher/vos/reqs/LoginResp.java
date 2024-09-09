package com.github.coderpreacher.vos.reqs;

import lombok.Data;

@Data
public class LoginResp {
    private String AccessToken;
    private String Token;
    private BuyerInfo BuyedPC;
    @Data
    public static class BuyerInfo {

        private String Phone;
        private String NickName;
    }
}
