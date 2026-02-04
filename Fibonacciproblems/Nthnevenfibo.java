import java.util.Scanner;
public class Nthnevenfibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("using loop even fibonical number :");
        System.out.println(nevenfibo(n));
        System.out.println("using formula ((4*b)+a) even fibonical number :");
        System.out.println(nevenfiboformula(n));
        sc.close();
    }
    static int nevenfibo(int n){
        int a=0,b=1,c=0,count=1;
        if(n==1) return 0;
        else{
            while(count<n){
                c=a+b;
                if(c%2==0)  count++;
                a=b;
                b=c;
            }
        }
        return c;
    }
    static int nevenfiboformula(int n){
        int a=0,b=2,c=0,count=2;
        while(count<n){
            c=(4*b)+a;
            count++;
            a=b;
            b=c;
        }
        return c;
        //System.out.println(c);
    }
}
