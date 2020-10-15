import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            String[] input = new String[2];
            input = br.readLine().split(" ");

            int N= Integer.parseInt(input[0]);
            int K= Integer.parseInt(input[1]);

            String[] p_s = new String[N];
            p_s = br.readLine().split(" ");
            int[] p= new int[N];
            for(int i=0;i<N;i++){
                p[i]=Integer.parseInt(p_s[i]);
            }

            int move,min_count=-1;
            int curr_count[]=new int[N];
            for(int i=0;i<N;i++){
                curr_count[i]=0;
                move=p[i];
                while(p[i]<K){

                    if(p[i]+move>K)
                        break;
                    curr_count[i]+=1;
                    p[i]+=move;
                }
                if(p[i]!=K){
                    curr_count[i]=-1;
                }

                if((curr_count[i]!=-1 && min_count==-1)||(min_count>curr_count[i]&& curr_count[i]!=-1))
                min_count=curr_count[i];
                p[i]=move;
            }

            if(min_count==-1)
                System.out.println(-1);
            else
            {
                int i;
                for (i=0;i<N;i++){
                    if(min_count==curr_count[i])
                        break;
                }
                System.out.println(p[i]);
            }

            T--;
        }
        br.close();
        ir.close();

    }
}
