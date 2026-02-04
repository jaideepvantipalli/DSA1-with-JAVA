import java.util.Scanner;
public class PowerOfX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(findpower(n, x));
        sc.close();
    }
    static int findpower(int n,int x){
        int res=1;
        while(n>0){
            if(n%2==0){
                n/=2;
                x*=x;
            }
            else{
                n--;
                res=res*x;
            }
        }
        return res;
    }
}
