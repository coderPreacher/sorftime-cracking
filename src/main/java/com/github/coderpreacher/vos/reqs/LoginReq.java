package com.github.coderpreacher.vos.reqs;

import lombok.Data;

@Data
public class LoginReq {
    private String SubName;
    private String SubPwd;
    private String site;
}
