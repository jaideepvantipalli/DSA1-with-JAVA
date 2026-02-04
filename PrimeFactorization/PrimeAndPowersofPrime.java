/* to find primes and thier powers stiring in nested arraylist*/
import java.util.ArrayList;
import java.util.Scanner;
public class PrimeAndPowersofPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        System.out.println("Enter a number to find Prime Factors : ");
        int n=sc.nextInt();
        System.out.println("Prime Factors :");
        al.addAll(primefactors(n));
        System.out.print(al);
        sc.close();
    }
    static ArrayList<ArrayList<Integer>> primefactors(int n){
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        int c=0;
        while (n%2==0) { 
            c++;
            n/=2;
        }
        if(c>0){
            ArrayList<Integer> sl=new ArrayList<>();
            sl.add(2);
            sl.add(c);
            al.add(sl);
        }
        for(int i=3;i*i<=n;i+=2){
            c=0;
            while (n%i==0) { 
                c++;
                n/=i;
            }
        }
         if(c>0){
            ArrayList<Integer> sl=new ArrayList<>();
            sl.add(2);
            sl.add(c);
            al.add(sl);
        }
        if(n>1){
            ArrayList<Integer> sl=new ArrayList<>();
            sl.add(n);
            sl.add(1);
            al.add(sl);
        }
        return al;
    }
}