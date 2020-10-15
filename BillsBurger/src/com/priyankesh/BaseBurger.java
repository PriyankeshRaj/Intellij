package com.priyankesh;

public class BaseBurger {
    private String breadRollType;
    private boolean meat;
    private int BaseRs;
    private int Rs=0;
    private int addRs=0;
    
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean maiyonnaise;


    public BaseBurger(String breadRollType, boolean meat, int BaseRs) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.BaseRs=BaseRs;
    }
    
    public void setAdditions(boolean lettuce, boolean tomato, boolean carrot, boolean maiyonnaise) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.maiyonnaise = maiyonnaise;
    }

    public int additionsPrice(){
        if(carrot){
            addRs+=10;
            System.out.println("Carrot:10");}
        if(lettuce){
            addRs+=5;
            System.out.println("Lettuce:5");}
        if(maiyonnaise){
            addRs+=12;
            System.out.println("Maiyonnaise:12");}
        if(tomato){
            addRs+=7;
            System.out.println("Tomato:7");}
        return addRs;
    }

    private int getAddRs(){
        return addRs;
    }
    
    
    
    public int price(int price){
        System.out.println("Base Price: "+BaseRs);
        additionsPrice();
        System.out.println("Additional price: "+(getAddRs()+price));
        Rs+=getAddRs()+BaseRs+price;
        System.out.println("Final Price: "+Rs);
        return Rs;
    }

    public int getRs() {
        return Rs;
    }
}
