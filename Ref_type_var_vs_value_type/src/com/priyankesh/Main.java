package com.priyankesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int myIntValue=5;
	int anotherIntValue=myIntValue;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        int[] myIntArray=new int[4];
        int[] anotherIntArray=myIntArray;

        System.out.println("myIntArray = "+ Arrays.toString( myIntArray));
        System.out.println("anotherIntArray = "+ Arrays.toString( anotherIntArray));

        myIntArray[1]=1;

        System.out.println("changed myIntArray = "+ Arrays.toString( myIntArray));
        System.out.println("changed anotherIntArray = "+ Arrays.toString( anotherIntArray));

        modifyArray(myIntArray);

        System.out.println("modified myIntArray = "+ Arrays.toString( myIntArray));
        System.out.println("modified anotherIntArray = "+ Arrays.toString( anotherIntArray));

    }

    public static void modifyArray(int myArray[]){
        myArray[2]=1;
    }
}
