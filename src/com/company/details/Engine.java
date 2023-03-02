package com.company.details;
public class Engine {
    private int power;
    private String company;

    public Engine(int power,String company){
        this.company=company;
        this.power=power;
    }

    @Override
    public String toString() {
        return "Мощность = " + power +", "+
                "Производитель = "+ company + '\n'+"----------------"+'\n';
    }
}
