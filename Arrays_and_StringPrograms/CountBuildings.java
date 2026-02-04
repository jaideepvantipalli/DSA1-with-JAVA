import java.util.Scanner;
import java.util.Stack;
public class CountBuildings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Buildings: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter building heights : ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        CountBuildingsusingforloop(a,n);
        CountBuildingsusingstack(a,n);
        sc.close();
    }
    static void CountBuildingsusingforloop(int a[],int n){
        int max=a[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(a[i]>max){
                count++;
                max=a[i];
            }
        }
        System.out.println("Using for loop : ");
        System.out.println("Buildings Facing towards SUN is :"+count);
    }
        static void CountBuildingsusingstack(int a[],int n){
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++){
            if(st.peek()<a[i]){
                st.push(a[i]);
            }
        }
        System.out.println("Using Stack : ");
        System.out.println("Buildings Facing towards SUN is :"+(st.size()-1));
    }
}
