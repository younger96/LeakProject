package com.example.a47420.leakproject;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class LeakApp extends Application {
    private RefWatcher refWatcher;
    @Override
    public void onCreate() {
        super.onCreate();
        refWatcher = setupLeakCanary();

    }

    private RefWatcher setupLeakCanary() {
        return LeakCanary.install(this);
    }


    //获取内存泄漏监视器
    public static RefWatcher getRefWatcher(Context context){
        LeakApp app = (LeakApp) context.getApplicationContext();
        return app.refWatcher;
    }
}
