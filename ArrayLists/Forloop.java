/*1) create an ArrayList of 'n' elements and print them using normal for loop.*/
import java.util.*;
public class Forloop{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println("Using for Loop :");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}