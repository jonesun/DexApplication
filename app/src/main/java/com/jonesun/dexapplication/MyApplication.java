package com.jonesun.dexapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by jone.sun on 2016/8/8.
 */

public class MyApplication extends Application {
    private static MyApplication mInstance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        mInstance = this;
        PluginManager.getInstance().loadPluginApk();
    }

    /**
     * 获取Application的实例
     */
    public static MyApplication getInstance() {
        return mInstance;
    }
}
