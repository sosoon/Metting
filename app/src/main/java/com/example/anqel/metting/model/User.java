package com.example.anqel.metting.model;

/**
 * Created by Anqel on 2016/7/21.
 */
public class User {

    private String userId;//用户Id
    private String mobile;//手机号
    private String userName;//用户名
    private String headUrl;//头像
    private String remark;//备注名

    private String hasAdd;//是否已添加


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHasAdd() {
        return hasAdd;
    }

    public void setHasAdd(String hasAdd) {
        this.hasAdd = hasAdd;
    }
}
