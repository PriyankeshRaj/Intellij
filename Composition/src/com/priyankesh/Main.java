package com.priyankesh;

public class Main {

    public static void main(String[] args) {
    //Monitor has a Resolution named nativeResolution.
    //Case has a Dimensions named dimensions.
    //PC has a Motherboard ,a Monitor,a Case
        //A Composition is a "Has A' relationship.
        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("2208","Dell","240",dimensions);

        Monitor theMonitor=new Monitor("27 INCH Beast","Hp",27,new Resolution(2540,1440));
        Motherboard theMotherboard=new Motherboard("Bh-200","Asus",4,6,"v2.44");

        PC thePc=new PC(theCase,theMonitor,theMotherboard);
        thePc.powerUp();
    }
}
