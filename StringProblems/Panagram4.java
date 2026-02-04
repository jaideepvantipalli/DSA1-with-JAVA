import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
public class Panagram4{
      public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Sentence :");
        String s=br.readLine();
        System.out.print(usingHashSet(s));
  }
  static boolean usingHashSet(String s){
    if(s.length()<26) return false;
    HashSet<Integer> hs =new HashSet<>();
    s=s.toLowerCase();
    for(int i=0;i<s.length();i++){
      int ch = s.charAt(i);
      if(ch<='z' && ch>='a') 
      hs.add(ch);
    }
    return hs.size() == 26;
  }
}
