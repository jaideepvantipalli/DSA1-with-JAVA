/*7) create ArrayList of n elements and remove all even numbers
 * note:print before removing and after removing*/
import java.util.*;
public class DeleteEvenNo {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println("Before Removing Even's :");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        al.removeIf(ele->(ele%2==0));
        System.out.println("After Removing Even's :");
        for(Integer x:al){
            System.out.print(x+" ");
        }
    }
}
