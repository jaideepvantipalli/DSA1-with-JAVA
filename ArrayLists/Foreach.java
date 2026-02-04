/*2) create an ArrayList of 'n' elements and print them using for each loop*/
import java.util.*;
public class Foreach{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println("Using for Each:");
        for(int value:al){
            System.out.print(value+" ");
        }
    }
}