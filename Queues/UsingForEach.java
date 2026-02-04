import java.util.LinkedList;
import java.util.Queue;

public class UsingForEach {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(562);
        q.offer(561);        
        q.add(563);
        q.offer(509);
        q.add(516);
        System.out.println("Using for Each :");
        for(Integer ele:q){
            System.out.print(ele+" ");
        }
    }
}