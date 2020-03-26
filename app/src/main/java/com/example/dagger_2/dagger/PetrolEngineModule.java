package com.example.dagger_2.dagger;

import com.example.dagger_2.car.PetrolEngine;
import com.example.dagger_2.car.Rims;
import com.example.dagger_2.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
