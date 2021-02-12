package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("eAJMF9oo5Z53wokO2yrSkJ4bUAFygopvzkqIXK9J")
                .clientKey("enFDuLQqGalR4Wj60eqawzveaSNVo8XkjJGywm83")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
