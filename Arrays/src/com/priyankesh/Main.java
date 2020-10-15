package com.priyankesh;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    int[] myInteger=getIntegers(5);
    printArray(myInteger);
	int[] myInt={1,2,3,4,5,6,7,8,9,10};
        printArray(myInt);

    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
        {
            System.out.println("The number is "+array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" Integer values.\r");
        int[] values=new int[number];

        for(int i=0;i<values.length;i++)
        {
            values[i]=scanner.nextInt();
        }
        return values;
    }
}
