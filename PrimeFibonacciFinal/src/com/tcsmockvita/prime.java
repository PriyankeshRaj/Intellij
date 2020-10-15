package com.tcsmockvita;

import java.lang.reflect.Array;
import java.util.*;

public class prime {
    private int n1,n2;
    private int min,max;
    private int size;
    private ArrayList<Integer> primeNo=new ArrayList<Integer>();

    prime(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public ArrayList<Integer> getPrimeNo() {
        return primeNo;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getSize() {
        return size;
    }

    public void arrayAdd() {

        for (int i = n1; i <= n2; i++) {
            if (checkPrime(i)){
                primeNo.add(i);
            }
        }

    }

    public void arrayAdd(ArrayList<Integer> temp){
        for (int i=0;i<temp.size();i++){
            int n=temp.get(i);
            if (checkPrime(n)){
                primeNo.add(n);
            }
        }

        Collections.sort(primeNo);
        removeDuplicates(primeNo);
        min=primeNo.get(0);
        size=primeNo.size();
        max=primeNo.get(size-1);

    }

    private boolean checkPrime(int n){
        if (n == 2)
            return true;
        if (n < 2 || n % 2 == 0)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();

        // Add the elements to set
        set.addAll(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }



}
