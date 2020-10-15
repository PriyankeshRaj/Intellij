package com.codechef;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
	int T= sc.nextInt();
	while(T!=0)
    {
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] d=new int[n];

        for(int i=0;i<n;i++)
        {
            d[i]=sc.nextInt();
        }
        for(int i:d)
        {
           if(i%k==0)
               System.out.print(1);
           else
               System.out.print(0);
        }
        T--;
    }
    }
}
