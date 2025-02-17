import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference=0;

    // Add your code here
    Difference(int[] array){
        this.elements=array;
    }
    void computeDifference(){
        int diff;
        for(int i=0;i<elements.length;i++){
            for(int j=0;j<i;j++){
            diff=elements[i]-elements[j];
            diff=(diff<0?-diff:diff);
            if(diff>maximumDifference)
                maximumDifference=diff;
            }
        }
    }
} // End of Difference class

public class MethodDifference_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}