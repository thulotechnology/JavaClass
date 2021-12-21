package com.company;

public class Tesla extends Car{
    boolean selfDrivingmode;

    void printCarInfo(){
        System.out.println("Car name is "+this.name);
        System.out.println("Car price is "+this.price);
        System.out.println("Self Driving Mode: "+this.selfDrivingmode);
    }
}
