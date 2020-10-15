import java.util.Scanner;
public class Introduction_to_String {
    /*Given two strings of lowercase English letters,  and , perform the following operations:

    Sum the lengths of  and .
            Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
    Capitalize the first letter in  and  and print them on a single line, separated by a space.
    Input Format

    The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

            Output Format

    There are three lines of output:
    For the first line, sum the lengths of  and .
    For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
    For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.*/

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int a=A.length();
            int b=B.length();
            System.out.println(a+b);
            System.out.println(A.compareTo(B)>0?"Yes":"No");
            System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,a)+" "+B.substring(0,1).toUpperCase()+B.substring(1,b));


        }
    }
