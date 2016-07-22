package com.example.anqel.metting.model.response;

import com.example.anqel.metting.model.BaseEntity;
import com.example.anqel.metting.model.Friends;

/**
 * Created by Anqel on 2016/7/22.
 */
public class ResponseFriends extends BaseEntity {

    private Friends result;

    public Friends getResult() {
        return result;
    }

    public void setResult(Friends result) {
        this.result = result;
    }
}
