package com.priyankesh;

public class Dogs extends Animals {

    private int eye;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dogs(String name, int size, int weight, int eye, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eye = eye;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("dog.chew() is accessed.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() in dog class accessed.");
        chew();
        super.eat();

    }
}
