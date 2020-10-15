package com.priyankesh;

import java.util.Scanner;

public class Main {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            scanner.close();
            int k=0,sum=0,max=0;
            for(int i=0;i<=3;i++){
                for(int j=0;j<=3;j++)
                {
                    k=j;sum=0;
                    while(k<=(2+j))
                    {
                        System.out.print(arr[i][k]+" "+arr[i+2][k]+" ");
                        sum+=arr[i][k]+arr[i+2][k];
                        if(k==(2+j))
                        {
                            System.out.println(arr[i+1][k-1]+" sum= ");
                            sum+=arr[i+1][k-1];;
                            if(max<=sum){
                                max=sum;
                            }
                            System.out.println(sum+"\n");
                        }
                        k++;
                    }
                    if(i==0&&j==0)
                    {
                        max=sum;
                    }
                }
                System.out.println("");
            }
            System.out.println(max);
        }
    }
