package com.example.momoni.utils;

import android.os.Handler;
import android.util.Log;

import com.example.momoni.api.Api;
import com.example.momoni.bean.SouBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegHttpurls {

    public static Handler handler=new Handler();

    public static void  doGet(String url, String keyword, String page, String count, final SuccessOrError orError){

        /*
        * 创建管理器
        * */
        Retrofit builder = new Retrofit.Builder()
                .baseUrl(Api.BACK)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.i("传过来的","sdasdas==="+url+","+keyword+"，"+page+","+count);
        /*
        * 实现接口
        * */
        UserApiService userApiService = builder.create(UserApiService.class);
        /*
        * 拼接参数
        * */
        Call<SouBean> souBeanCall = userApiService.regGet(url, keyword, page, count);
        /*
        * 请求数据
        * */
        souBeanCall.enqueue(new Callback<SouBean>() {
            @Override
            public void onResponse(Call<SouBean> call, Response<SouBean> response) {

                final SouBean body = response.body();
                /*for (int i=0;i<10;i++) {
                    Log.i("请求结果", "onResponse:== "+body.result.get(i).commodityName);
                }*/
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        orError.Success(body);

                    }
                });

            }

            @Override
            public void onFailure(Call<SouBean> call, Throwable t) {

            }
        });


    }

    public interface SuccessOrError{
        void Success(Object o);
        void Error();
    }


}
