package com.tcsmockvita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis=new FileInputStream("abc.txt.txt");

        int data1=fis.read();
        int data2=fis.read();
        int data3=fis.read();

        System.out.println("data1: "+data1+" "+"data2: "+data2+" "+"data3: "+data3);
        fis.close();
    }
}
