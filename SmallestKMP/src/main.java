import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class main {

    public static void main(String[] args) throws java.lang.Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int T = Integer.parseInt(br.readLine());
        while (T > 0) {
        String S= br.readLine();
        String P= br.readLine();

        char S_temp[]=S.toCharArray();
        char P_temp[]=P.toCharArray();
            Arrays.sort(S_temp);
            System.out.println(S_temp);
            int P_length=P_temp.length;
            int S_length=S_temp.length;
            int k,j=0;
            for(k=0;;k++)
            {
                if(P_temp[0]<S_temp[i])
                {
                    break;
                }
            }
            k--;
            int s=0;
            char[] newS=new char[S_length];
            char temp;
            for(int i=0;i<=k;i++)
            {
                for(int j=s;j<P_length;j++)
                {
                    if(P_temp[j]==S_temp[i]) {
                        s++;
                        break;
                    }
                    newS[i]=S_temp[i];
                }


            }
            for(int i=0;i< P_temp.length;i++)
            /*for(int i=0;i< P_temp.length;i++)
            {
                for(int j=0;j< S_temp.length;j++)
                {
                    if(P_temp[i]>S_temp[j])
                    {
                        temp=S_temp[j];
                        S_temp[j]=P_temp[i];

                    }
                }
            }
*/


        T--;
        }
        br.close();
        ir.close();
    }

}
