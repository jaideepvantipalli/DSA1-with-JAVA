/*8. Find and return all prime factors of n as ArrayList */
import java.util.*;
public class ArraylistPrimefactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("Enter a number to find Prime Factors : ");
        int n=sc.nextInt();
        System.out.println("Prime Factors :");
        al.addAll(primefactors(n));
        for(int x:al)
        System.out.print(x+" ");
        sc.close();
    }
    static ArrayList<Integer> primefactors(int n){
        ArrayList<Integer> al=new ArrayList<>();
        while (n%2==0) { 
            al.add(2);
            n/=2;
        }
        for(int i=3;i*i<=n;i+=2){
            while (n%i==0) { 
                al.add(i);
                n/=i;
            }
        }
        if(n>1){
        al.add(n);
        }
        return al;
    }
}
