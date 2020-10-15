package com.priyankesh;

public class Printer {
    private int toner_level;
    private int no_of_pages_printed=0;
    boolean is_duplex;

    public Printer(int toner_level, boolean is_duplex) {
        this.toner_level = toner_level;
        this.is_duplex = is_duplex;
    }
    public void fillUpToner(int add){
        this.toner_level+=add;
        if(toner_level>100){
            toner_level=100;
            System.out.println("Toner level overfilled.");
        }
    }
    public void printPages(int print){
        int pagesprint=print;
        if(is_duplex){
            pagesprint/=2;
        }
        this.no_of_pages_printed+=print;

        System.out.println("No of pages prined:"+no_of_pages_printed);
    }

    public int getToner_level() {
        return toner_level;
    }

    public int getNo_of_pages_printed() {
        return no_of_pages_printed;
    }

    public boolean isIs_duplex() {
        return is_duplex;
    }
}
