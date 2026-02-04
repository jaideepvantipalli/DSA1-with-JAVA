import java.util.Arrays;
import java.util.Scanner;
public class Anagram1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1=sc.next();
        System.out.println("Enter String 2 : ");
        String s2=sc.next();
        System.out.println("is anagaram : "+usingsorting(s1,s2));
    }

    static boolean usingsorting(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        String s11 = s1.toLowerCase();
        String s22 = s2.toLowerCase();
        char[] ch1 = s11.toCharArray();
        char[] ch2 = s22.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s1 = String.valueOf(ch1);
        s2 = String.valueOf(ch2);
        return s1.equals(s2);
    }
}
