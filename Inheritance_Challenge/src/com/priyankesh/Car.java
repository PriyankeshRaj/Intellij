package com.priyankesh;

public class Car extends Vehicle {
    private int door;
    private int gear;
    private int wheels;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int door, int gear, int wheels, boolean isManual) {
        super(name, size);
        this.door = door;
        this.gear = gear;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1    ;
    }

    public void changeGear(int currentGear) {
        this.currentGear =currentGear;
        System.out.println("Car gear changed to"+this.currentGear+"gear");
    }

    public void changeVelocity(int velcoity,int direction)
    {
        move(velcoity,direction);
        System.out.println("Velocity is: "+velcoity+"direction is:"+direction);
    }
}