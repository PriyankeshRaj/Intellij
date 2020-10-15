import java.util.Scanner;

public class Lets_REVIEW_30Days_string {

         public static void main(String[] args) {
             /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
             Scanner sc = new Scanner(System.in);
             int T = sc.nextInt();
             int size, i,count;
             String s;
             while (T>=0) {

                     s = sc.nextLine();
                     size = s.length();
                     i = size / 2;
                     count = 1;
                     for (i = 0; i < size; i = i + 2) {
                         System.out.print(s.charAt(i));

                         if ((i == size || i == size - 1 || i == size - 2) && count > 0) {
                             i = -1;
                             count--;
                             System.out.print(" ");
                         }

                     }
                     T--;

              }

         }

}