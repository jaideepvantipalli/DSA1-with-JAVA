import java.util.HashMap;
import java.util.Scanner;
public class Anagram2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1=sc.next();
        System.out.println("Enter String 2 : ");
        String s2=sc.next();
        System.out.println("is anagaram : "+usinghashmaps(s1,s2));
        sc.close();
    }

    static boolean usinghashmaps(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
        }
        return hm1.equals(hm2);
    }
}