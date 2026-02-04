import java.util.LinkedList;
import java.util.Queue;

public class UsingLambda {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(562);
        q.add(561);        
        q.add(563);
        q.offer(509);
        q.add(516);
        System.out.println("Using Lambda :");
        q.stream().forEach(s->System.out.print(s+" "));
    }
}