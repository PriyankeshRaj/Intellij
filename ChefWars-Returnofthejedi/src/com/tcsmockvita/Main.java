package com.tcsmockvita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            String[] input = new String[2];
            input = br.readLine().split(" ");

            int H= Integer.parseInt(input[0]);
            int P= Integer.parseInt(input[1]);
            while (H > 0 && P > 0) {
                H -= P;
                P /= 2;
            }
            if (H <= 0) {
                System.out.println(1);
            }
            else
                {
                    System.out.println(0);
                }
            T--;
        }
        br.close();
        i.close();
        
    }
}
