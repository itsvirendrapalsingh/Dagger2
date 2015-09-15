package com.dagger.example.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import com.dagger.example.zopper.dagger2.Car;
import com.dagger.example.zopper.dagger2.Motor;
import com.dagger.example.zopper.dagger2.Vehicle;

/**
 * Created by zopper on 10/9/15.
 */
@Module
public class VehicleModule
{
    Vehicle vehicle;
    Car car;

   /* VehicleModule(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    VehicleModule(Car car)
    {
        this.car = car;
    }*/

   /* @Provides public Vehicle getVehicle()
    {
        return vehicle;
    }

    @Provides public Car returnCar()
    {
        return car;
    }*/

    @Provides @Singleton
    Motor provideMotor()
    {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle()
    {
        return new Vehicle(new Motor());
    }

    @Provides
    Car getCar(Vehicle vehicle)
    {
        return new Car(vehicle);
    }
}
