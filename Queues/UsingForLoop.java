import java.util.Stack;

public class UsingForLoop {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(562);
        st.push(561);        
        st.push(563);
        st.push(509);
        st.push(516);
        System.out.println("Using for Each :");
        for(int i=st.size()-1;i>=0;i--){
            System.out.print(st.get(i)+" ");
        }
    }
}