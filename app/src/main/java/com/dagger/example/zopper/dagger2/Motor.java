package com.dagger.example.zopper.dagger2;

/**
 * Created by zopper on 10/9/15.
 */
public class Motor
{
    private int rpm;

    public Motor()
    {
        this.rpm = 0;
    }

    public int getRpm()
    {
        return rpm;
    }

    public void accelerate(int value)
    {
        rpm = rpm + value;
    }

    public void brake()
    {
        rpm = 0;
    }
}
