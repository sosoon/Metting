package com.example.anqel.metting.Presenter;

import com.example.anqel.metting.api.ApiService;
import com.example.anqel.metting.api.RxService;
import com.example.anqel.metting.model.request.RequestLogin;
import com.example.anqel.metting.model.response.ResponseLogin;
import com.example.anqel.metting.view.LoginView;
import com.example.anqel.metting.view.MvpView;
import com.orhanobut.logger.Logger;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Anqel on 2016/7/21.
 */
public class LoginPresenter extends BasePresenter<LoginView> {

    @Override
    public void attachView(LoginView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void login(String mobile, String verifyCode) {

        RequestLogin requestLogin=new RequestLogin();
        requestLogin.setMobile(mobile);
        requestLogin.setVerifyCode(verifyCode);

        RxService.createApi(ApiService.class).login(requestLogin).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ResponseLogin>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Logger.e(e.getMessage());
            }

            @Override
            public void onNext(ResponseLogin responseLogin) {

                getMvpView().onSuccess(responseLogin.getResult());

            }
        });

    }

    public void register(String mobile, String verifyCode) {

        RequestLogin requestLogin=new RequestLogin();
        requestLogin.setMobile(mobile);
        requestLogin.setVerifyCode(verifyCode);

        RxService.createApi(ApiService.class).register(requestLogin).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<ResponseLogin>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Logger.e(e.getMessage());
            }

            @Override
            public void onNext(ResponseLogin responseLogin) {

                getMvpView().onSuccess(responseLogin.getResult());

            }
        });

    }
}
