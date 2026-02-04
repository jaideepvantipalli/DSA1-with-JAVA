/*4)  create an ArrayList of 'n' elements and print them using ListIterator. */
import java.util.*;
public class ListIteratorprob {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println("Using ListIterator :");
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
    }
}
