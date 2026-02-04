import java.util.Iterator;
import java.util.Stack;

public class UsingIterator {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(562);
        st.push(561);        
        st.push(563);
        st.push(509);
        st.push(516);
        Iterator<Integer> it=st.iterator();
        System.out.println("Using Iterator");
        while(it.hasNext()) System.out.print(it.next()+" ");
    }
}