import java.util.*;
class GCDMethods{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value a :");
		int a=sc.nextInt();
		System.out.println("Enter value b :");
		int b=sc.nextInt();
		System.out.println("using arthemtic GCD is :"+gcdarthimetic(a,b));
		System.out.println("using loop GCD is :"+gcdloop(a,b));
		System.out.println("using euclid GCD is :"+gcdeuclid(a,b));
		
	}
	static int gcdarthimetic(int a,int b){
		while(a!=b){
			if(a>b){
				a=a-b;
			}else{
				b=b-a;
			}
		}
		return a;
	}
	static int gcdloop(int a,int b){
		int min=Math.min(a,b);
		while(min>1){
			if(a%min==0&&b%min==0){
				return min;
			}
			min--;
		}
		return min;
	}
	static int gcdeuclid(int a,int b){
		int r;
		while(b%a!=0){
			r=b%a;
			b=a;
			a=r;
		}
		return a;
	}
}