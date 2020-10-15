import java.util.Scanner;

public class static_block {

//Write your code here
/*There are two lines of input. The first line contains : the breadth of the parallelogram.
The next line contains : the height of the parallelogram.
 Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram.
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

        static Scanner sc=new Scanner(System.in);
        static int B=sc.nextInt();
        static int H=sc.nextInt();
        static boolean flag;
        static{
            if(B>0 && H>0){
                flag=true;
            }
            else{
                flag=false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }

        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }//end of class



