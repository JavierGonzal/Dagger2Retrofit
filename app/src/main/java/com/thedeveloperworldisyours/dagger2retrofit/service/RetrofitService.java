package com.thedeveloperworldisyours.dagger2retrofit.service;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by javierg on 01/07/16.
 */
public class RetrofitService {
    public Retrofit buildRedditRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://echo.jsontest.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}