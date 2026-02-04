import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to Check : ");
        int num=sc.nextInt();
        boolean m1=isprimemethod1(num);
        boolean m2=isprimemethod2(num);
        boolean m3=isprimemethod3(num);
        boolean m4=isprimemethod4(num);
        boolean m5=isprimemethod5(num);
        printprime(m1,1);
        printprime(m2,2);
        printprime(m3,3);
        printprime(m4,4);
        printprime(m5,5);
        sc.close();
    }
    static boolean isprimemethod1(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) c++;
        }
        return c==2?true:false;//O(N)
    }
        static boolean isprimemethod2(int n){
            if(n<=1) return false;
        int c=1;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
            }
        }return c==1?true:false;//O(sqrt(N))
    }
        static boolean isprimemethod3(int n){
        int c=1;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2) return true;//O(N/2)
        else return false;
    }
        static boolean isprimemethod4(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;//O(<sqrt(N))
    }
        static boolean isprimemethod5(int n){
        if(n<=1) return false;
        if(n==2||n==3)return true;
        if(n%2==0||n%3==0)return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;//O(<<Sqrt(N))
        }
        static void printprime(boolean var,int mno){
            if (var) {
                System.out.println("using method "+mno+" Prime number");
            }
            else
            System.out.println("using method "+mno+" not a Prime number");
        }
}