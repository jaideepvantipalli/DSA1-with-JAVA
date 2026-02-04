import java.util.*;
//import java.util.Stack;
public class UsingListIterator {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(562);
        st.push(561);        
        st.push(563);
        st.push(509);
        st.push(516);
        ListIterator lit=st.listIterator();
        System.out.println("Using List Iterator");
        while(lit.hasNext()) System.out.print(lit.next()+" ");
    }
}