/*6)  create an ArrayList of 'n' elements and print them using Lambda Expression.*/
import java.util.*;
public class Lambda{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println("Using Lambda Expression :");
        al.forEach(value->System.out.print(value+" "));
    }
}