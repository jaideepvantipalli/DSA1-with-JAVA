import java.util.Scanner;
public class Method1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all prime upto n :");
        int n=sc.nextInt();
        System.out.println("Using  Method 1 prime Numbers :");
        for(int i=1;i<=n;i++){
            if(isprime(i))
            System.out.print(i+" ");
        }
        sc.close();
    }
    static boolean isprime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) c++;
        }
        if(c==2) return true;
        else return false;
    }
}
