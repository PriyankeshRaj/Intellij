package com.codechef;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean found = false;
            /*for (int i=x; i <= n+x; i += k) {
                if (i%n == y) {
                    System.out.println("YES");
                    found=true;
                    break;
                }
            }*/
            if(x==y||(y>x&&(    (n-x+y-x)%k==0) )||(x>y&&(  (n-x+y)%k==0)   )) {
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}
