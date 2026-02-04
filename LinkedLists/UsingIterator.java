import java.util.*;
public class UsingIterator{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.addFirst(20);
        ll.add(40);
        ll.add(30);
        ll.addLast(50);
        ll.addFirst(69);
        System.out.println("Using Iterator :");
        Iterator it=ll.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}