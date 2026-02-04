
import java.util.Scanner;

public class Altitudes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Buildings: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter building heights : ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        findaltitude(a,n);
        sc.close();
    }
    static void findaltitude(int a[],int n){
        int steps=0;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]) steps++;
            else if (a[i]==a[i+1]) continue;                             
            else steps--;
        }
        System.out.println("maximum altitude is : "+steps);
    }
}
