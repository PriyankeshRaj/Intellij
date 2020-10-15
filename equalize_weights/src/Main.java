import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] sum = new int[n];
        int perBag, req, temp, size, totalSum = 0;
        boolean swap;
        int[][] bag = new int[n][20];


        /*System.out.println("Bag Size= " + n);*/

        for (int i = 0; i < n; i++) {
            size = sc.nextInt();
            /*System.out.println("Bag" + i);
            System.out.println("size= " + size);*/
            for (int j = 0; j < size; j++) {
                bag[i][j] = sc.nextInt();
                /*  System.out.println("bag[" + i + "][" + j + "] = " + bag[i][j]);*/
                sum[i] += bag[i][j];
                totalSum += bag[i][j];
                /*System.out.println("Sum " + i + " = " + sum[i]);*/
            }
        }
        sc.close();
        perBag = totalSum / n;
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; bag[i][j] != 0; j++) {
                System.out.println(bag[i][j] + " ");
                sum[i] += bag[i][j];
                totalSum += bag[i][j];
            }
            System.out.println("Sum " + i + " = " + sum[i]);
        }*/
        /* System.out.println(totalSum);*/

        for (int i = 0; i < n; i++) {
            if (sum[i] != perBag) {
                /*System.out.println("Entered if");*/
                swap = false;
                req = perBag - sum[i];
                /*System.out.println("req="+req);*/
                for (int k = i + 1; (k < n); k++) {
                    for (int j = 0; bag[i][j] != 0; j++) {
                        for (int l = 0; bag[k][l] != 0; l++) {
                            if (bag[i][j] + req == bag[k][l]) {
                                /*System.out.println("swapping " + bag[i][j] + " with " + bag[k][l]);*/
                                sum[k] = sum[k] - bag[k][l] + bag[i][j];
                                sum[i] = sum[i] + bag[k][l] - bag[i][j];
                                temp = bag[k][l];
                                bag[k][l] = bag[i][j];
                                bag[i][j] = temp;
                                swap = true;
                                break;
                            }
                        }
                        if (swap)
                            break;
                    }
                    if (swap)
                        break;
                }
            }
        }

        int k;
        //Sorting Array
        for(int i=0;i<n;i++)
        {
            Arrays.sort(bag[i]);
            k = 0;
            for(int j=0;j<20;j++)
            {
                if (bag[i][j] != 0)
                {
                    bag[i][k]=bag[i][j];
                    bag[i][j]=0;
                    k++;
                }
            }
        }
        k = 0;
        while (k < n) {
            sum[k] = bag[k][0];
            k++;
            }
        Arrays.sort(sum);
        k = 0;
        while (k < n) {
            for (int i = 0; i < n; i++) {
                if (sum[k] == bag[i][0]) {
                    for (int j = 0; bag[i][j]!=0; j++) {
                            System.out.print(bag[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            k++;
        }
        /*k=0;
            while(k<n)
            {
                Arrays.sort(bag[k]);
                arr[k][0]=bag[k][0];
                arr[k][1]=k;
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                System.out.println(arr[i][0]+" "+arr[i][1]);
            }*/
    }

    }

