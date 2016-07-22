package com.example.anqel.metting.activity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.anqel.metting.Presenter.LoginPresenter;
import com.example.anqel.metting.R;
import com.example.anqel.metting.model.User;
import com.example.anqel.metting.view.LoginView;
import com.orhanobut.logger.Logger;

/**
 * Created by Anqel on 2016/7/20.
 */
public class LoginActivity extends BaseActivity implements LoginView {

    private EditText et_phone;
    private EditText et_verify;
    private Button btn_login;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initData();
    }


    private void initView() {
        et_phone = (EditText) findViewById(R.id.et_phone);
        et_verify = (EditText) findViewById(R.id.et_verify);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login(et_phone.getText().toString(), et_verify.getText().toString());
            }
        });
    }


    private void initData() {
        loginPresenter = new LoginPresenter();
        loginPresenter.attachView(this);
    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, int imageId) {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener) {

    }

    @Override
    public void onSuccess(User user) {
        Logger.e("111111111",user.toString());
    }
}
