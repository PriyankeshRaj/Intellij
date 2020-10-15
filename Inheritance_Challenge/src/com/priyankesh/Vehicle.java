package com.priyankesh;

public class Vehicle {
    private String name;
    private String size;

    private int CurrentVelocity;
    private int CurrentDirection;

    public Vehicle(String name, String size) {
        this(name,size,0,0);
    }

    public Vehicle(String name, String size, int CurrentVelocity, int CurrentDirection) {
        this.name = name;
        this.size = size;
        this.CurrentVelocity = CurrentVelocity;
        this.CurrentDirection = CurrentDirection;
    }

    public void steer(int directon){
        this.CurrentDirection=+directon;
        System.out.println("Vehicle is moving in the direction "+this.CurrentDirection);
    }

    public void move(int velocity,int directon) {
        this.CurrentDirection=+directon;
        this.CurrentVelocity = +velocity;
        System.out.println("Vehicle is moving at a velocity of "+this.CurrentVelocity+" in the direction " +this.CurrentDirection);
    }

    public void stop(){
        this.CurrentVelocity=0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }
}


