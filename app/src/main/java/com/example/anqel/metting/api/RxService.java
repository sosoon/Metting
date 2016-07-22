package com.example.anqel.metting.api;

import com.example.anqel.metting.utils.Constants;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import static java.lang.String.format;

public class RxService {


    //    private static OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor
//            (new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build();
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor
            (new Interceptor() {

                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    Request newReq = request.newBuilder()
                            .addHeader("Authorization", format("token %s", "123456"))
                            .build();
                    return chain.proceed(newReq);
                }
            }).build();
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASEURL)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private RxService() {
        //construct

    }

    public static <T> T createApi(Class<T> clazz) {

        return retrofit.create(clazz);
    }

}
