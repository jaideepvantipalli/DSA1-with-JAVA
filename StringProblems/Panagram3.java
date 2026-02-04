import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Panagram3{
      public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Sentence :");
        String s=br.readLine();
        System.out.println("is panagram : "+usingContainsMethod(s));
  }
  static boolean usingContainsMethod(String s){
    s=s.toLowerCase();
    String s1 = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0;i<s1.length();i++){
      if(s.indexOf(s1.charAt(i)) == -1 ) return false;
    }
    return true;
  }
}
