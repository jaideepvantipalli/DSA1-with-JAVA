import java.util.Scanner;
public class FrequencyOfElementLinearSearch{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        System.out.println("Enter target Element : ");
        int target=sc.nextInt();
        int count=0;
        for(int i:a){
            if(i==target) count++;
        }
        System.out.println("Frequency of target is : "+count);
       }
}