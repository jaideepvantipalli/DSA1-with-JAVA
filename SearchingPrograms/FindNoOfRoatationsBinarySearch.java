import java.util.Scanner;
public class FindNoOfRoatationsBinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        
        System.out.println(findnofofroations(a));
    }
    static int findnofofroations(int a[]){
        int l=0,h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            //if(a[l]<=a[h]) return l;
            else if(a[l]<a[mid])
            {
                if(a[mid]<=a[h]) 
                h=mid;
                else
                l=mid+1;
            }
            else 
            {
                if(a[l]<=a[h])
                l=mid+1;
                else
                h=mid;
            }
        }
        return a[l];
    }
}
