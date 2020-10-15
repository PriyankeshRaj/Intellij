package com.priyankesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer=new Printer(0,false);
        System.out.println("Toner Level:"+ printer.getToner_level());
        System.out.println("Is printer duplex:"+printer.isIs_duplex());
        System.out.println("No of pages printed:"+printer.getNo_of_pages_printed());
        printer.fillUpToner(50);
        System.out.println("Toner Level:"+ printer.getToner_level());
        printer.printPages(2);
        printer.printPages(4);
        printer.printPages(6);
    }
}
