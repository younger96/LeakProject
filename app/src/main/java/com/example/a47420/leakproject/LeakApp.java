package com.example.a47420.leakproject;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class LeakApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);

    }
}
