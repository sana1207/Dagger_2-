package com.example.dagger_2.car;

import android.util.Log;

import javax.inject.Inject;

public class DiesalEngine implements Engine {
    private  static final String TAG = "Car";
    private int horsePower;
    @Inject
    public DiesalEngine(int horsePower){
        this.horsePower=horsePower;
    }
    @Override
    public void start(){
        Log.d(TAG,"Diesal engine started. "+horsePower);
    }
}
