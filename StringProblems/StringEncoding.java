import java.util.*;
public class StringEncoding {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.next();
        encode(s);  
    }
    static void encode(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') sb.append('z');
            else if(s.charAt(i)=='z') sb.append('a');
            else if((i+1)%2==0) sb.append((char)(s.charAt(i)+1));
            else sb.append((char)(s.charAt(i)-1));
        }
        System.out.print(sb.toString());
    }
}
