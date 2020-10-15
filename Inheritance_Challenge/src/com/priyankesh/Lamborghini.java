package com.priyankesh;

public class Lamborghini extends Car{
  private int roadServiceMonth;

    public Lamborghini(int door, int gear, int wheels, boolean isManual, int roadServiceMonth) {
        super("Lamborghini", "Gallardo",2, 6, 4, false);
        this.roadServiceMonth = roadServiceMonth;
    }
}
