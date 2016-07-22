package com.example.anqel.metting.view;

import com.example.anqel.metting.model.User;

/**
 * Created by Anqel on 2016/7/21.
 */
public interface UserView extends MvpView {

    void onSuccess(User user);
}
