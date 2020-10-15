package com.priyankesh;

public class HealthyBurger extends BaseBurger{
    private boolean Cauliflower;
    private boolean Cabbage;

    public HealthyBurger(String breadRollType, boolean meat, int BaseRs, boolean cauliflower, boolean cabbage) {
        super(breadRollType, meat, BaseRs);
        Cauliflower = cauliflower;
        Cabbage = cabbage;
        priceBurger();
    }
    private void priceBurger(){
        int RS=0;
        if(Cauliflower){
            RS+=10;
            System.out.println("Cauliflower+10");
        }
        if(Cabbage){
            RS+=12;
            System.out.println("Cabbage+12");
        }
        price(RS);
    }

}
