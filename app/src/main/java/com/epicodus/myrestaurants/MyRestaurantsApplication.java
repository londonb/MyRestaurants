package com.epicodus.myrestaurants;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by owner on 5/1/16.
 */
public class MyRestaurantsApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
