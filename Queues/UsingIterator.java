import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UsingIterator {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(562);
        q.offer(561);        
        q.add(563);
        q.offer(509);
        q.add(516);
        System.out.println("Using Iterator :");
        Iterator<Integer> it=q.iterator();
        while(it.hasNext()) System.out.print(it.next()+" ");
    }
}