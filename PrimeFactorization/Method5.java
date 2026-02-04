import java.util.Scanner;

public class Method5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all prime upto n :");
        int n=sc.nextInt();
        System.out.println("Using Method 5 Prime numbers:");
        for(int i=1;i<=n;i++){
            if(isprime(i))
            System.out.print(i+" ");
        }
        sc.close();
    }
    static boolean isprime(int n){
        if(n<=1)return false;
        if(n==2||n==3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0)
            return false;
        }return true;
    }
}