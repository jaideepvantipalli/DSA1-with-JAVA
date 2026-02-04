import java.util.Scanner;
public class FrequencyOfElementBinarySearch{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        System.out.println("Enter target Element : ");
        int target=sc.nextInt();
        
        int f=findlastoccurence(a,n,target)-findfirstoccurence(a,n,target)+1;
        System.out.println("Frequency of target is : "+Math.abs(f));
    }
    static int findfirstoccurence(int a[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(a[mid]==x){
                if(a[mid-1]==x){
                    high=mid-1;
                }
                else return mid;
            }
            else if(a[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return 0;
    } 
    static int findlastoccurence(int a[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(a[mid]==x){
                if(a[mid+1]==x&&mid<n-1){
                    low=mid+1;
                }
                else return mid;
            }
            else if(a[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return 0;
    }
}