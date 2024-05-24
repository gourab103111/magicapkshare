package com.scriptsbundle.adforest;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.android.gms.ads.MobileAds;
import com.google.android.libraries.places.api.Places;

import com.scriptsbundle.adforest.helper.LocaleHelper;
import com.scriptsbundle.adforest.utills.NoInternet.AppLifeCycleManager;
import timber.log.Timber;

public class App extends Application {
    private static App instance;
    static {
        System.loadLibrary("keys");
    }
    public static native String placeInitialize();

    public static App getInstance() {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        MobileAds.initialize(this, initializationStatus -> Timber.d("AdMob initialized"));
        AppLifeCycleManager.init(this);
        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), placeInitialize());
        }

    }

    @Override
    protected void attachBaseContext(Context base) {
//        super.attachBaseContext(base);//LocaleHelper.onAttach(base, "en")
        super.attachBaseContext(LocaleHelper.onAttach(base, "en"));
        MultiDex.install(this);
    }
}
