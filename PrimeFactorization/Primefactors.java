/*Find and display all prime factors of n*/
import java.util.Scanner;

public class Primefactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find Prime Factors : ");
        int n=sc.nextInt();
        System.out.println("Prime Factors :");
        while (n%2==0) { 
            System.out.print(2+" ");
            n/=2;
        }
        for(int i=3;i*i<=n;i+=2){
            while (n%i==0) { 
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>1) System.out.print(n);
    }
}
