import java.util.*;
public class UisngSeiveMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print prime upto N");
        int n=sc.nextInt();
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j=j+i)
                    arr[j]=false;
            }
        }
        System.out.println("Using Sieve Method prime numbers : ");
        for(int i=0;i<n;i++){
            if(arr[i]==true)
            System.out.print(i+" ");
        }
    }
}
