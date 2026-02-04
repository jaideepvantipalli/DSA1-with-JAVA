import java.util.Scanner;
public class RotatedSortedSearchArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        System.out.println("Enter target Element : ");
        int target=sc.nextInt();
        
        System.out.println(rotatedsearch(a,target));
    }
    static int rotatedsearch(int a[],int x){
        int l=0,h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==x) return mid;
            else if(a[l]<a[mid])
            {
                if(x>=a[l]&&x<=a[mid]) 
                h=mid;
                else
                l=mid+1;
            }
            else 
            {
                if(x>=a[mid]&&x<a[h])
                l=mid+1;
                else
                h=mid;
            }
        }
        return -1;
    }
}
