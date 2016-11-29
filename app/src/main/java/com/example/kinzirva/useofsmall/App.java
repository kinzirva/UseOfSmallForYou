package com.example.kinzirva.useofsmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by kinzirva on 2016/11/24.
 */

public class App extends Application {
    public App() {
        // This should be the very first of the application lifecycle.
        // It's also ahead of the installing of content providers by what we can avoid
        // the ClassNotFound exception on if the provider is unimplemented in the host.
        Small.preSetUp(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Optional
        Small.setBaseUri("http://m.wequick.net/demo/");
        Small.setWebViewClient(new MyWebViewClient());
        Small.setLoadFromAssets(BuildConfig.LOAD_FROM_ASSETS);
    }
}
