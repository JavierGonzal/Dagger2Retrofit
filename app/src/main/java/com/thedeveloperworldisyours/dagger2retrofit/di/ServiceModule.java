package com.thedeveloperworldisyours.dagger2retrofit.di;

import com.thedeveloperworldisyours.dagger2retrofit.service.ApiService;
import com.thedeveloperworldisyours.dagger2retrofit.service.RetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

/**
 * Created by javierg on 01/07/16.
 */
@Module
public class ServiceModule {
    @Provides
    @Singleton
    public RetrofitService providesRetrofitService() {
        return new RetrofitService();
    }

    @Provides
    @Singleton
    public ApiService providesApiService(RetrofitService retrofitService) {
        Retrofit retrofit = retrofitService.buildRedditRetrofit();
        return retrofit.create(ApiService.class);
    }
}

