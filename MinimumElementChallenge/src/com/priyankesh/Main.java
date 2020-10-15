package com.priyankesh;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	int count=scanner.nextInt();
	scanner.nextLine();
	int Intarray[]=readInteger(count);
    System.out.println("Minimum Value Integer is: "+findMin(Intarray));
    }
    public static int[] readInteger(int count){
        int array[]=new int[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter a Number: ");
            array[i]=scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    public static int findMin(int array[]){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i] > array[j]) {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array[0];
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
