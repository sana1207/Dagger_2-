package com.example.dagger_2;

import android.app.Application;

import com.example.dagger_2.dagger.AppComponent;
import com.example.dagger_2.dagger.DaggerAppComponent;
import com.example.dagger_2.dagger.DriverModule;

//import com.example.dagger_2.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
     private AppComponent component;

     @Override
     public void onCreate(){
         super.onCreate();
         component = DaggerAppComponent.factory().create(new DriverModule("John" ));

     }
     public AppComponent getAppComponent(){
         return component;
     }
}
