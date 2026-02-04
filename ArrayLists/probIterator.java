/*3)  create an ArrayList of 'n' elements and print them using Iterator.*/
import java.util.*;
public class probIterator{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Using Iterator :");
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}