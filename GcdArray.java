import java.util.Scanner;
public class GcdArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int gcdofarr=gcd(arr);
        System.out.println("Gcd is :"+gcdofarr);
        sc.close();
    }
    static int gcd(int arr[]){
        int ans=gcds(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            ans=gcds(ans,arr[i]);
        }
        return ans;
    }
    static int gcds(int a,int b){
		int r;
		while(b%a!=0){
			r=b%a;
			b=a;
			a=r;
		}
		return a;
	}
}
