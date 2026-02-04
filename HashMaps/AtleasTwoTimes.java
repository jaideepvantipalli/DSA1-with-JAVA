/*8. Consider Array of n elements, find frequency of each element.
        Print all the elements that occurs atleast  2 times*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AtleasTwoTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        System.out.println("Elements occurring Atleast 2 times:");
        for (Map.Entry<Integer, Integer> e : freq.entrySet())
            if (e.getValue() >= 2) System.out.print(e.getKey() + " ");
        sc.close();
    }
}
