import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.HashMap;
public class Panagram1 {
      public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Sentence :");
        String s=br.readLine();
        System.out.println("is panagram : "+usingHashMap(s));
  }
  
  static boolean usingHashMap(String s){
    if(s.length()<26) return false;
    s=s.toLowerCase();
    HashMap<Character,Integer> hm = new HashMap<>();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(ch<='z' && ch>='a') 
        hm.put(ch, hm.getOrDefault(ch, 0)+1);
    }
    return hm.size() == 26;
  }
}
