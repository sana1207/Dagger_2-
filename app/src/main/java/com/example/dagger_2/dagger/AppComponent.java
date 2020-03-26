package com.example.dagger_2.dagger;

import com.example.dagger_2.car.Driver;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule driverModule);
    }
}
