package com.example.dagger_2.dagger;

//import com.example.dagger_2.DaggerActivityComponent;
import com.example.dagger_2.car.DiesalEngine;
import com.example.dagger_2.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DiesalEngineModule {
    private int horsePower;

    public DiesalEngineModule(int horsePower){
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower(){
        return horsePower;
    }
    @Provides
    Engine provideEngine(DiesalEngine engine){
        return engine;
    }
}
