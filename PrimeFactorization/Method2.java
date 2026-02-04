import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all prime upto n :");
        int n=sc.nextInt();
        System.out.println("Using  Method 2 prime Numbers :");
        for(int i=1;i<=n;i++){
            if(isprime(i))
            System.out.print(i+" ");
        }
        sc.close();
    }
    static boolean isprime(int n){
        int c=1;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) c++;
        }
        return c==2?true:false;
    }
}