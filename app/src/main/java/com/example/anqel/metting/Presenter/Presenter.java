package com.example.anqel.metting.Presenter;

import com.example.anqel.metting.view.MvpView;

public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
