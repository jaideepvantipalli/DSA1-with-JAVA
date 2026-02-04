
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Panagram2{
      public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Sentence :");
        String s=br.readLine();
        System.out.println("is panagram: "+usingArray(s));
  }

  static boolean usingArray(String s){
    if(s.length()<26) return false;
    s = s.toLowerCase();
    int a[] = new int[26];
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch<='z' && ch>='a') a[ch-'a']++;
    }
    for(int i=0;i<26;i++){
      if(a[i] == 0) return false;
    }
    return true;
  }
}
