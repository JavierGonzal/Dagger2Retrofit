package com.thedeveloperworldisyours.dagger2retrofit.service;

import com.thedeveloperworldisyours.dagger2retrofit.model.Example;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by javierg on 01/07/16.
 */
public interface ApiService {
    @GET("key/value/one/two")
    Call<Example> getExampleCall();
}
