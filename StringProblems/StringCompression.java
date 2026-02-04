import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.next();
        compress(s);  
    }
    static void compress(String s){
        StringBuilder sb=new StringBuilder();
        int c=1;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch) c++;
            else{
                sb.append(s.charAt(i-1));
                sb.append(c);
                ch=s.charAt(i);
                c=1;
            }
        }
        sb.append(ch).append(c);
        System.out.print(sb.toString());
    }
}
