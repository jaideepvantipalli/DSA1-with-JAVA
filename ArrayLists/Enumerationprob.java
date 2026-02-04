import java.util.*;
/*5)  create an ArrayList of 'n' elements and print them using  Enumaration.*/
public class Enumerationprob{
    public static void main(String[] args) {
        ArrayList<Double> al=new ArrayList<>(Arrays.asList(10.2,30.4,45.6,56.7,89.0));
        System.out.println("using Enumeration : ");
        Enumeration<Double> en =Collections.enumeration(al);
        while (en.hasMoreElements()) { 
            System.out.print(en.nextElement()+" ");
        }
    }
}