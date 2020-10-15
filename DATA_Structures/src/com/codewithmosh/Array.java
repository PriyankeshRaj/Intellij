package com.codewithmosh;


import java.util.Arrays;

public class Array {
    private int i;
    private int[] arr;

    public Array(int length)
    {
        arr=new int[length];
    }

    private void incrementSize()
    {
        int[] new_arr=new int[arr.length+1];
        for(int j=0;j<arr.length;j++)
        {
            new_arr[j]=arr[j];
        }
        arr=new_arr;

    }
    private void decrementSize()
    {
        int[] new_arr=new int[arr.length-1];
        for(int j=0;j<arr.length-1;j++)
        {
            new_arr[j]=arr[j];
        }
        arr=new_arr;
    }

    public void insert(int item)
    {
        if(i>=arr.length){
        incrementSize();
        }
        arr[i]=item;
        i++;
    }
    public void removeAt(int index)
    {
    if(index<0||index>=i) {
        throw new IllegalArgumentException();
    }
    else if(index==arr.length-1)
    {
    arr[index]=0;
    decrementSize();
    }
    else
    {
        for(int j=index;j<arr.length-1;j++)
        {
            arr[j]=arr[j+1];
        }
        decrementSize();
    }
    }
    public int indexOf(int num) {
        for(int j=0;j< arr.length;j++)
        {
            if(num==arr[j])
                return j;
        }
        return -1;
    }
    public void print(){
        System.out.println( Arrays.toString(arr));
    }
}
