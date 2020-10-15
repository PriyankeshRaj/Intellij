import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int t, den, a, ct;

        t = sc.nextInt();

        while (t != 0) {
            t--;
            den = sc.nextInt();

            a = 1;
            ct = 0;

            while (den > 0) {

                den -= a;

                a = a + 1;

                ct++;

            }

            System.out.println(ct);
        }
    }
}
