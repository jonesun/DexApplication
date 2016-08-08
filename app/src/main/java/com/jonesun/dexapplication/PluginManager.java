package com.jonesun.dexapplication;

import android.util.Log;

import com.jonesun.library.TestInterface;

/**
 * Created by jone.sun on 2016/8/8.
 */

public class PluginManager {
    private static final String PLUGIN_NAME = "plugin.apk";
    private PluginLoader mPluginLoader;

    private static final class PluginManagerHolder {
        private static final PluginManager INSTANCE = new PluginManager();
    }

    public static PluginManager getInstance() {
        return PluginManagerHolder.INSTANCE;
    }

    /**
     * Load theloadDtPluginApk apk
     */
    public void loadPluginApk() {
        if (mPluginLoader == null) {
            mPluginLoader = new PluginLoader();
            mPluginLoader.loadPluginApk(PLUGIN_NAME);
        }
    }

    /**
     * 创建一个TestUtil插件
     */
    public TestInterface createTestPluginInstance() {
        if (mPluginLoader == null) {
            Log.e("PluginManager", "createTestPluginInstance plugin loader is null");
            return null;
        }

        TestInterface testManager = (TestInterface) mPluginLoader.newInstance("com.jonesun.plugin.TestUtil");
        return testManager;
    }
}
