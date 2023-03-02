package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;


public class Lorry extends Car{
    private int carrying;
    public Lorry(String marka, String carClass, Driver driver, Engine engine,int carrying) {
        super(marka, carClass ,driver, engine);
        this.carrying=carrying;
    }
    @Override
    public String toString() {
        return "Грузовик: " + super.toString() +
                "Грузoпoдъемнocть кузoвa = " + carrying + '\n' ;
    }
}
