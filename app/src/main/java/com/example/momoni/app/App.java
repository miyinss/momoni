package com.example.momoni.app;

import android.app.Application;

import com.example.momoni.utils.DaoUtils;
import com.facebook.drawee.backends.pipeline.Fresco;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        DaoUtils.getIntent().initGreendao(this);
    }
}
