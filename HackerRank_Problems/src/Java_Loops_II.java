import java.util.Scanner;

public class Java_Loops_II {

    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int j,k,sum=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum=a+b;
            k=1;
            for(j=0;j<n;j++)
            {
                if(j!=0)
                    sum+=k*b;
                System.out.print(sum+" ");
                k*=2;
            }
            System.out.println();
        }
        in.close();
    }
}

