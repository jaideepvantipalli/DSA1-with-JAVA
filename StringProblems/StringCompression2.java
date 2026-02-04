import java.util.*;
public class StringCompression2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.next();
        compress(s);  
    }
    //count to hexadecimal string
    static void compress(String s){
        StringBuilder sb=new StringBuilder();
        int c=1;
        char ch=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch) c++;
            else{
                sb.append(s.charAt(i-1));
                sb.append(Integer.toHexString(c).toUpperCase());
                ch=s.charAt(i);
                c=1;
            }
        }
        sb.append(ch).append(Integer.toString(c));
        System.out.print(sb.toString());
    }
}
