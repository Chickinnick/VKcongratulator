package com.chickinnick.vkcongratulator;

import android.app.Application;

import com.vk.sdk.VKSdk;

public class Launcher extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(getApplicationContext());
    }
}
