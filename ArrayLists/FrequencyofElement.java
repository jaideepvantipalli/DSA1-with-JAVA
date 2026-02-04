import java.util.*;
/*8) create ArrayList of n elements and verify how many times 'x' an element exists*/
public class FrequencyofElement {
    public static void main(String[] args) {
        int findelefreq=5;
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,5,3,5,9));
        int freq=Collections.frequency(al,findelefreq);
        System.out.println("Element to find frequency "+findelefreq+" : "+freq+" times Occured");
    }
}
