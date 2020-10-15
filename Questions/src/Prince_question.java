import java.util.Scanner;

public class Prince_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k,a;
        boolean check_series = false;
        i = sc.nextInt();
        j = sc.nextInt();
        while (true) {
            k = sc.nextInt();
            if (k == 0) {
                break;
            }
            if (   (  (i >= j) && (j >= k) && (i > k) )){
                check_series = true;
            } else if(  (   (i <= j) && (j <= k) && (i < k) )   ) {
                check_series = true;
            }
            else {
                check_series = false;
                break;
            }
            i = j;
            j = k;
        }

        System.out.println(check_series);
        sc.close();
    }
}

