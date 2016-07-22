package com.example.anqel.metting.model.response;

import com.example.anqel.metting.model.BaseEntity;
import com.example.anqel.metting.model.User;

/**
 * Created by Anqel on 2016/7/21.
 */
public class ResponseLogin extends BaseEntity {
    private User result;

    public User getResult() {
        return result;
    }

    public void setResult(User result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponseLogin{" +
                "result=" + result +
                '}';
    }
}
