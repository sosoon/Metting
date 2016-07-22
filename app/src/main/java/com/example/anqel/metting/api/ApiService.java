package com.example.anqel.metting.api;

import com.example.anqel.metting.model.BaseEntity;
import com.example.anqel.metting.model.request.RequestLogin;
import com.example.anqel.metting.model.request.RequestUser;
import com.example.anqel.metting.model.response.ResponseFriends;
import com.example.anqel.metting.model.response.ResponseLogin;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Observable;

/**
 * Created by Anqel on 2016/7/21.
 */
public interface ApiService {

    //    @Multipart
//    @POST("register")
//    Observable<ResponseLogin> login(@Part("mobile") String mobile,@Part("verifyCode") String verifyCode);
//    @Headers({"Content-Type: application/json","Accept: application/json"})

    //1注册
    @POST("register")
    Observable<ResponseLogin> register(@Body RequestLogin requestLogin);

    //1登录
    @POST("login")
    Observable<ResponseLogin> login(@Body RequestLogin requestLogin);

    //3修改用户名
    @POST("update/username")
    Observable<BaseEntity> updateName(@Body RequestUser requestUser);

    // 4修改头像
    @POST("update/headimage")
    Observable<BaseEntity> updateHeadImage(@Body RequestUser requestUser);

    // 5获取好友列表
    @POST("list/friend")
    Observable<ResponseFriends> getFriend(@Body RequestUser requestUser);

    // 6搜索好友
    @POST("search/friend")
    Observable<ResponseFriends> searchFriend(@Body RequestUser requestUser);

    // 7添加好友
    @POST("add/friend")
    Observable<BaseEntity> addFriend(@Body RequestUser requestUser);

    // 8删除好友
    @POST("delete/friend")
    Observable<BaseEntity> deleteFriend(@Body RequestUser requestUser);

    // 9修改好友备注名
    @POST("update/remark")
    Observable<BaseEntity> updateRemark(@Body RequestUser requestUser);
}
