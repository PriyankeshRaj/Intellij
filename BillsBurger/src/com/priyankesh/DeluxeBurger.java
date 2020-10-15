package com.priyankesh;

public class DeluxeBurger extends BaseBurger{
    private boolean chips;
    private boolean drinks;
    public DeluxeBurger(String breadRollType, boolean meat, int BaseRs, boolean chips, boolean drinks) {
        super(breadRollType, meat, BaseRs);
        this.chips = chips;
        this.drinks = drinks;
        priceBurger();
    }
    private void priceBurger(){
        int RS=0;
        if(chips){
            RS+=5;
            System.out.println("Chips+5");
        }
        if(drinks){
            RS+=30;
            System.out.println("Drinks+30");
        }
        price(RS);
    }
}
