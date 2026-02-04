/*6. Consider Array of n elements, remove duplicates. Output should be in sorted order descending order  */
import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicatesDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) set.add(num);

        System.out.println("Unique elements in Descending order : " + set);
        sc.close();
    }
}