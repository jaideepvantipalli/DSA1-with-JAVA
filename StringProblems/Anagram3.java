import java.util.HashMap;
import java.util.Scanner;
public class Anagram3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1=sc.next();
        System.out.println("Enter String 2 : ");
        String s2=sc.next();
        System.out.println("is anagaram : "+usinghashmap(s1,s2));
        sc.close();
    }

    static boolean usinghashmap(String s1,String s2){
        if (s1.length() != s2.length()) return false;
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i=0;i<s1.length();i++)
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i), 0) + 1);

        for (int i=0;i<s1.length();i++) {
            if (!hm.containsKey(s2.charAt(i))) return false;
            hm.put(s2.charAt(i), hm.get(s2.charAt(i)) - 1);
            if (hm.get(s2.charAt(i))==0) 
            hm.remove(s2.charAt(i));
        }
        return hm.isEmpty();
    }
}
