package com.example.dagger_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger_2.car.Car;
import com.example.dagger_2.dagger.ActivityComponent;
//import com.example.dagger_2.dagger.DaggerActivityComponent;
import com.example.dagger_2.dagger.DiesalEngineModule;
//import com.example.dagger_2.dagger.ActivityComponent;
//mport com.example.dagger_2.dagger.DaggerAppComponent;


//import com.example.dagger_2.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1,car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = (((ExampleApp) getApplication()).getAppComponent())
                  .getActivityComponentFactory().create(150,1400);
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
