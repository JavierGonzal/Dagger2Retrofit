package com.thedeveloperworldisyours.dagger2retrofit;

import android.app.Application;

import com.thedeveloperworldisyours.dagger2retrofit.di.DaggerRootComponent;
import com.thedeveloperworldisyours.dagger2retrofit.di.RootComponent;

/**
 * Created by javierg on 01/07/16.
 */
public class MyApplication extends Application{
    private static RootComponent sRootComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sRootComponent = DaggerRootComponent.builder().build();
    }

    public static RootComponent getComponent() {
        return sRootComponent;
    }
}
