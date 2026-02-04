/*1. Consider Array of n elements, find frequency of each element.
        Print elements and their frequencies according  to input order  */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("\nElement ---> Frequency");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
        sc.close();
    }
}
