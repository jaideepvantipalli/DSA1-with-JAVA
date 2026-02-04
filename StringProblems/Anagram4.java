import java.util.Arrays;
import java.util.Scanner;
public class Anagram4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1=sc.next();
        System.out.println("Enter String 2 : ");
        String s2=sc.next();
        System.out.println("is anagaram : "+usinguserdefinedhashmaps(s1,s2));
    }

    static boolean usinguserdefinedhashmaps(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            a[ch1-'a']++;
            b[ch2-'a']++;
        }
        return Arrays.equals(a,b);
    }
}
