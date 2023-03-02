package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    private double speed;

    public SportCar(String marka, String carClass, Driver driver, Engine engine,double speed) {
        super(marka, carClass,driver, engine);
        this.speed=speed;
    }
    @Override
    public String toString() {
        return "SportCar: " + super.toString()+
                "Максимальная скорость = " + speed;
    }
}
