package com.priyankesh;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scanner.nextInt();
        scanner.nextLine();
        int Intarray[] = readInteger(count);
        reverseArray(Intarray);
        printArray(Intarray);
    }

    private static void reverseArray(int[] reverse){
        int temp;
        int half=reverse.length/2;
        int full=reverse.length-1;
        for(int i=0;i<half;i++){
            temp=reverse[i];
            reverse[i]=reverse[full-i];
            reverse[full-i]=temp;
        }
    }

    private static int[] readInteger(int count) {
        int array[] = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a Number: ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
