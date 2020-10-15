package com.priyankesh;

public class Main {

    public static void main(String[] args) {
	BaseBurger baseBurger=new BaseBurger("Mexican",true,80);
        baseBurger.setAdditions(true,true,true,true);
        System.out.println(baseBurger.price(0));

        HealthyBurger healthyBurger=new HealthyBurger("American",true,100,true,true);
        healthyBurger.setAdditions(true,true,true,true);
        System.out.println(healthyBurger.getRs());

        DeluxeBurger deluxeBurger=new DeluxeBurger("Indian",true,120,true,true);
        deluxeBurger.setAdditions(true,true,true,true);
        System.out.println(healthyBurger.getRs());
    }
}
