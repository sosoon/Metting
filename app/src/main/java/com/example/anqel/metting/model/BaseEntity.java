package com.example.anqel.metting.model;

/**
 * Created by Anqel on 2016/7/21.
 */
public class BaseEntity {

    private String status;
    private String code;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
