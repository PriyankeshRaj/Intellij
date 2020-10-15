package com.tcsmockvita;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			prime obj = new prime(n1, n2);
			obj.arrayAdd();
			obj.printPrimeNo();

		ArrayList<Integer> temp=uniqueCombinationsList(obj);

		prime obj2=new prime(0,temp.size());

		obj2.arrayAdd(temp);
		temp=obj2.removeDuplicates(temp);
		printArrayList(temp);

		obj2.printPrimeNo();

		int min=obj2.getMin();
		int max=obj2.getMax();

		System.out.println("min= "+min+" max="+max);
		fibonacci(min,max,obj2.getSize());
    }

    public static ArrayList<Integer> uniqueCombinationsList(prime obj){
    	ArrayList<Integer> list=new ArrayList<Integer>(obj.getPrimeNo());
    	ArrayList<Integer> UnqCom=new ArrayList<Integer>();
    	for(int i=0;i<list.size();i++) {
    		for (int j=i+1;j<list.size();j++){
    			/*if(j==i)
				{
					continue;
				}*/
    			UnqCom.add( 	unqComFind( list.get(i),list.get(j) ) 	);
				UnqCom.add( 	unqComFind( list.get(j),list.get(i) ) 	);
			}
		}

    	return UnqCom;
    }

    public static void printArrayList(ArrayList<Integer> temp){
		Collections.sort(temp);
		System.out.println("You have "+temp.size()+" nos in your ArrayList.\n={ ");
		for(int i=0;i<temp.size();i++) {
			System.out.print(temp.get(i)+", ");
		}
		System.out.print("}");
	}

	public static int unqComFind(int a,int b){
    	String s=a+""+b;
    	int n=Integer.parseInt(s);

    	return n;
	}

	public static void fibonacci(int min,int max,int size){
	long f1,f2,f3;
	f1=min;
	f2=max;
	f3=f1+f2;
	for(int i=2;i<size;++i){
	f3=f1+f2;
	f1=f2;
	f2=f3;
	}
		System.out.println(f3);
	}
}
