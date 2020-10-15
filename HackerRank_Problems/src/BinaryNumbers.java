import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);
    public static long Dec_to_Binary(long n){
        if(n==1||n==0){
            return n;
        }
        else
            return n%2+10*Dec_to_Binary(n/2);
    }
    public static long Consec_one(long n) {
        String s = Long.toString(n);
        int c=0,count = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == '1') {
                 c++;
                 if(c>=count){
                     count=c;
                 }
             }
            else{
               c=0;
            }
        }
            return count;
        }
    public static void main(String[] args) {
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long Binary=Dec_to_Binary(n);
        System.out.println(Binary);
        System.out.println(Consec_one(Binary));

        scanner.close();
    }
}
