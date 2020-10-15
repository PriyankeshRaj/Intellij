import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            System.out.println();
            String[] input = new String[2];
            input = br.readLine().split(" ");
            int cF= Integer.parseInt(input[0]);
            int rF= Integer.parseInt(input[1]);
            System.out.println(cF+" "+rF);
            System.out.println(determineDigit(cF)+" "+ determineDigit(rF));
            if(determineDigit(cF)==1&&determineDigit(rF)==1){
                System.out.println(1+" "+1);
            }
            else {
                //Generating chef power : No of digits req of that power:b
                int b,c;
                b=(cF)/9;
                if(cF-(b*9)>0)
                    b++;
                //Generating Rick's power : No of digits req of that power:c
                c=rF/9;
                if(rF-(c*9)>0)
                    c++;
                System.out.println(b+" "+c);
                if(b==c)
                    System.out.println(1+" "+1);
                else
                    System.out.println(b<c?("0 "+b):("1 "+c));

                /*do {
                    if(c!=0)
                    a=sumofDigit(c);
                    else a=0;

                }while (a<cF);
*/
            }
            T--;
        }
        br.close();
        ir.close();
    }
    public static int determineDigit(int n)
    {
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
    return count;
    }
    /*public static int sumofDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum+=n%10;
            n = n / 10;

        }
        return sum;
    }
*/
    }
