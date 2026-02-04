import java.util.Scanner;

public class StringEncoding3 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size : ");
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++) s[i]=sc.next();
        encodearr(s);  
    }
    static void encodearr(String s[]){
        int i=0;
        for(String v:s){
            s[i++]=Integer.toString(v.length())+'#'+v;
        }
        for(String v:s)
        System.out.println(v);
    }
}
