package com.example.momoni.utils;


import com.example.momoni.bean.SouBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface UserApiService {

    @GET
    Call<SouBean> regGet(@Url String url, @Query("keyword") String keyword, @Query("page") String page, @Query("count") String count);



}
