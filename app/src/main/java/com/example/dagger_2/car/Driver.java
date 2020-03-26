package com.example.dagger_2.car;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Driver {
    String name;

    public Driver(String name){
        this.name=name;
    }

}
