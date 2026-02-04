import java.util.*;

public class ValidPalindromeorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        StringBuilder filtered = new StringBuilder();
        for(char ch : s.toCharArray()){
            if((ch >= 'a' && ch <= 'z')){
                filtered.append(ch);
            }
        }
        int left = 0, right = filtered.length() - 1;
        while(left < right){
            if(filtered.charAt(left) != filtered.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}