import java.util.*;
public class StringEncoding4 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.next();
        encode(s);  
    }
    static void encode(String s){
       StringBuilder sb=new StringBuilder(s);
       sb.reverse();
       System.out.print(sb.toString());
    }
}