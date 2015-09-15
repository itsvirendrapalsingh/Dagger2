package com.dagger.example.zopper.dagger2;

import javax.inject.Inject;

/**
 * Created by zopper on 10/9/15.
 */
public class Vehicle
{
    private Motor motor;

    @Inject
    public Vehicle(Motor motor)
    {
        this.motor = motor;
    }

    public void increaseSpeed(int value)
    {
        motor.accelerate(value);
    }

    public void stop()
    {
        motor.brake();
    }

    public int getSpeed()
    {
        return motor.getRpm();
    }
}
