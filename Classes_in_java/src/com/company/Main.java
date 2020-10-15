package com.company;

public class Main {

    public static void main(String[] args) {
        Car porshe=new Car();
        Car holden=new Car();
        System.out.println("Car model is "+porshe.getModel());
        porshe.setModel("Carrera");
        System.out.println("Car model is "+porshe.getModel());

    }
}
