package com.thedeveloperworldisyours.dagger2retrofit.di;

import com.thedeveloperworldisyours.dagger2retrofit.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by javierg on 01/07/16.
 */
@Singleton
@Component(modules = {
        ServiceModule.class
})
public interface RootComponent {
    void inject(MainActivity mainActivity);
}
