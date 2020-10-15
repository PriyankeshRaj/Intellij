package com.tcsmockvita;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
	int n=sc.nextInt();
	int[] max_arr=new int[n];
	for(int i=0;i<n;i++){
    max_arr[i]=sc.nextInt();
    }
	for(int i=0;i<n;i++){
        noOfDomination(max_arr[i]);
    }

    }
    public static void noOfDomination(int max){
        int sum=0;
        int count=0;
        for(int i=1;i<max;i++)
        {
            count++;
            sum+=i;
            if(sum>=max){
                break;
            }
        }
        System.out.println(count);
    }
}
