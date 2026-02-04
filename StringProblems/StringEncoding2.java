import java.util.*;
public class StringEncoding2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.next();
        encode(s);  
    }
    static void encode(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int charnum=(int)(s.charAt(i))+i;
            sb.append((char)(charnum/26));
        }
        System.out.print(sb.toString());
    }
}
