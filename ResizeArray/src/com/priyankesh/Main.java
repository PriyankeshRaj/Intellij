package com.priyankesh;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static int[] arr=new int[sc.nextInt()];
    public static void main(String[] args) {
	for(int i=0;i<arr.length;i++){
	    arr[i]=sc.nextInt();
    }
	print_arr();
    resize_arr();
    }
    private static void print_arr(){

        System.out.println(Arrays.toString(arr));
        }
    private static void resize_arr(){
        System.out.println("Enter the size of new array: ");
        int[] a=arr;
        arr=new int[sc.nextInt()];
        for(int i=0;i<a.length;i++) {
            arr[i] = a[i];
        }
        print_arr();
    }
}
