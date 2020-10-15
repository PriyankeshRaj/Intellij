import java.util.*;

class prime {
    private int n1,n2;
    private int min,max;
    private int size;
    private ArrayList<Integer> primeNo=new ArrayList<Integer>();

    prime(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public ArrayList<Integer> getPrimeNo() {
        return primeNo;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getSize() {
        return size;
    }

    public void arrayAdd() {

        for (int i = n1; i <= n2; i++) {
            if (checkPrime(i)){
                primeNo.add(i);
            }
        }

    }

    public void arrayAdd(ArrayList<Integer> temp){
        for (int i=0;i<temp.size();i++){
            int n=temp.get(i);
            if (checkPrime(n)){
                primeNo.add(n);
            }
        }

        Collections.sort(primeNo);
        removeDuplicates(primeNo);
        min=primeNo.get(0);
        size=primeNo.size();
        max=primeNo.get(size-1);

    }

    private boolean checkPrime(int n){
        if (n == 2)
            return true;
        if (n < 2 || n % 2 == 0)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();

        // Add the elements to set
        set.addAll(list);

        // Clear the list
        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(set);

        // return the list
        return list;
    }



}

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        prime obj = new prime(n1, n2);
        obj.arrayAdd();

        ArrayList<Integer> temp=uniqueCombinationsList(obj);

        prime obj2=new prime(0,temp.size());

        obj2.arrayAdd(temp);

        int min=obj2.getMin();
        int max=obj2.getMax();

        fibonacci(min,max,obj2.getSize());
    }

    public static ArrayList<Integer> uniqueCombinationsList(prime obj){
        ArrayList<Integer> list=new ArrayList<Integer>(obj.getPrimeNo());
        ArrayList<Integer> UnqCom=new ArrayList<Integer>();
        for(int i=0;i<list.size();i++) {
            for (int j=i+1;j<list.size();j++){
                UnqCom.add( 	unqComFind( list.get(i),list.get(j) ) 	);
                UnqCom.add( 	unqComFind( list.get(j),list.get(i) ) 	);
            }
        }

        return UnqCom;
    }

    public static int unqComFind(int a,int b){
        String s=a+""+b;
        int n=Integer.parseInt(s);

        return n;
    }

    public static void fibonacci(int min,int max,int size){
        long f1,f2,f3;
        f1=min;
        f2=max;
        f3=f1+f2;
        for(int i=2;i<size;++i){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(f3);
    }
}
