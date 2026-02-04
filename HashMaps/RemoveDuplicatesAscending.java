/*5. Consider Array of n elements, remove duplicates.Output should be in sorted order ascending order*/
import java.util.Scanner;
import java.util.TreeSet;
public class RemoveDuplicatesAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) set.add(num);

        System.out.println("Unique elements in Ascending order : " + set);
        sc.close();
    }
}