import java.util.Scanner;
public class SwappingOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b=sc.nextInt();
        swap1(a,b);
        swap2(a,b);
        swap3(a,b);
        swap4(a,b);
        swap5(a,b);
        sc.close();
    }
    static void swap1(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping 1st method : a = "+a+" b = "+b);
    }
    static void swap2(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping 2nd method : a = "+a+" b = "+b);
    }
    static void swap3(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping 3rd method : a = "+a+" b = "+b);
    }
    static void swap4(int a,int b){
        b=(a+b)-(a=b);
        System.out.println("After swapping 4th method : a = "+a+" b = "+b);
    }
    static void swap5(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping 5tht method : a = "+a+" b = "+b);
    }
}