import java.util.Scanner;

public class BinaryNumber_SimplifiedVersion {
    private static final Scanner scanner = new Scanner(System.in);
    public static int Dec_to_Binary(int n){
        int c=0;
        int count=0;
        int rem;
        while(n>0){
            rem=n%2;
            n=n/2;
            if(rem==1){
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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(Dec_to_Binary(n));
        scanner.close();
    }
}
