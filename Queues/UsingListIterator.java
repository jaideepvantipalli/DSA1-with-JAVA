import java.util.LinkedList;
import java.util.ListIterator;
public class UsingListIterator {
    public static void main(String[] args) {
        LinkedList<Integer> q = new LinkedList<>();
        q.add(562);
        q.offer(561);        
        q.add(563);
        q.offer(509);
        q.add(516);

        ListIterator<Integer> lit = q.listIterator();
        System.out.println("Using List Iterator:");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
    }
}
