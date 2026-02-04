import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all prime upto n :");
        int n=sc.nextInt();
        System.out.println("Using  Method 3 prime Numbers :");
        for(int i=1;i<=n;i++){
            if(isprime(i))
            System.out.print(i+" ");
        }
        sc.close();
    }
    static boolean isprime(int n){
        if(n<=1)return false;
        int c=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) c++;
        }
        if(c==1) return true;
        else return false;
    }
}