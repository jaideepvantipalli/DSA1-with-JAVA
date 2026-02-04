/*2. Construct HashMap to store n ( key,value) pairs or entries where key is student roll no and value is cgpa of student. 
Now print all the (key,value) pairs using entrySet() and getKey(),get value() methods*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentCGPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Double> studentMap = new HashMap<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Roll No: ");
            int rollNo=sc.nextInt();
            System.out.print("Enter CGPA: ");
            double cgpa=sc.nextDouble();

            studentMap.put(rollNo,cgpa);
        }
        System.out.println("\n--- Student Roll No & CGPA ---");
        for(Map.Entry<Integer, Double> entry : studentMap.entrySet()){
            System.out.println("Roll No: " + entry.getKey() + ", CGPA: " + entry.getValue());
        }
        sc.close();
    }
}
