import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries_Maps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phoneBook=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.get(s)!=null)
            System.out.println(s+"="+phoneBook.get(s));
            else
                System.out.println("Not Found");
        }
        in.close();
    }
}
