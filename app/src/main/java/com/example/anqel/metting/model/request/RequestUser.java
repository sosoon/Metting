package com.example.anqel.metting.model.request;

/**
 * Created by Anqel on 2016/7/22.
 */
public class RequestUser {

    private String userName;

    private String headData;
    private String keyword;
    private String userId;
    private String remark;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadData() {
        return headData;
    }

    public void setHeadData(String headData) {
        this.headData = headData;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
