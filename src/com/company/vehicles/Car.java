package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

public class Car {
   private String marka;
   private String carClass;
   private Driver driver;
   private Engine engine;

   public Car(String marka,String carClass,Driver driver,Engine engine){

       this.marka=marka;
       this.carClass=carClass;
       this.driver=driver;
       this.engine=engine;

   }
    static public void start() {
        System.out.println("Поехали");
    }

    static public void stop() {
        System.out.println("Останавливаемся");
    }

    static public void turnRight() {
        System.out.println("Поворот направо");
    }

    static public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override

    public String toString() {
        return '\n'+
                "Марка = " + marka +
                ", Класс = " + carClass + '\n' + driver +'\n'+
                "Мотор: "+'\n' + engine ;
    }
}
