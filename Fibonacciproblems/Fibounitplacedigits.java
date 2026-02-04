import java.util.Scanner;
public class Fibounitplacedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        System.out.println(fibo(n));

    }
    static int fibo(int n){
        int f[]=new int[60];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=(f[i-1]+f[i-2])%10;
        }
        return f[(n%60)-1];
    }
}
