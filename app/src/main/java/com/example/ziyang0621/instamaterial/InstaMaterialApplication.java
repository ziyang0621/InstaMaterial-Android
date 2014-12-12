package com.example.ziyang0621.instamaterial;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by ziyang0621 on 12/11/14.
 */
public class InstaMaterialApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
