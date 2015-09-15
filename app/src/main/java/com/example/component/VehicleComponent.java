package com.example.component;

import com.dagger.example.module.VehicleModule;
import com.dagger.example.zopper.dagger2.Car;
import com.dagger.example.zopper.dagger2.Motor;
import com.dagger.example.zopper.dagger2.Vehicle;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Created by zopper on 10/9/15.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent
{
    Vehicle provideVehicle1();
    Motor provideMotor1();
    Car getCarObject();
}
