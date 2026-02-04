/*We also discussed the following coding problems 
1. Construct LinkedList and traverse using for loop
2. Construct LinkedList and traverse using for Each loop
3. Construct LinkedList and traverse using Iterator
4. Construct LinkedList and traverse using List iterator
5. Construct LinkedList and traverse using lambda expression */
import java.util.*;
public class usingforloop{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.addFirst(20);
        ll.add(40);
        ll.add(30);
        ll.addLast(50);
        ll.addFirst(69);
        System.out.println("Using For Loop :");
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
    }
}