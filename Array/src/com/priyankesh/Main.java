package com.priyankesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] a;
	int[] a1=new int[4];
	int[] a2={5,2,1,0};
	String[] seque={"bananas","apples","pears"};
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
	a1[0]=2;
	a1[1]=-4;
	a1[2]=11;
	a1[3]=5;
        System.out.println(a1[0]);
        Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		//Special For loop(for-each):Prints no of times the size of the array is
		for (String s: seque ) {
			System.out.println(s);
			//or
			//simply sout("hello"):prints hello three times
		}

    }
}
