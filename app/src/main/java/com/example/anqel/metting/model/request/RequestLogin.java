package com.example.anqel.metting.model.request;

/**
 * Created by Anqel on 2016/7/21.
 */
public class RequestLogin {

    private String mobile;
    private String verifyCode;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
