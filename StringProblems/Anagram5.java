import java.util.Scanner;
public class Anagram5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1=sc.next();
        System.out.println("Enter String 2 : ");
        String s2=sc.next();
        System.out.println("is anagaram : "+usinguserdefinedhashmap(s1,s2));
    }
    static boolean usinguserdefinedhashmap(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int a[] = new int[26];

        for(int i=0;i<s1.length();i++)
        {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            a[ch1-'a']++;
            a[ch2-'a']--;
        }
        for(int i=0;i<26;i++)
            if(a[i]!=0) return false;
        return true;
    }
}
