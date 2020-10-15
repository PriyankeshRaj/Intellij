package com.company;

public class Car {
    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String valid_model=model.toLowerCase();
        if(valid_model.equals("porshe")||valid_model.equals("carrera"))
        this.model=model;
        else
        this.model="Unknown";
    }

    public String getModel(){
        return this.model;
    }
}
