/*9. Find sum of powers of prime factors of given number*/
import java.util.*;
public class SumofPowersPrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find Prime Factors : ");
        int n=sc.nextInt();
        System.out.println("Prime Factors sum is :"+primefactors(n));
    }
    static int primefactors(int n){
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
        return al.size();
    }
}
