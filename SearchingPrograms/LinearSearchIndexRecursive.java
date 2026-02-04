import java.util.*;

public class LinearSearchIndexRecursive {
    public static int linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return linearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int index = linearSearch(arr, target, 0);
        System.out.println(index == -1 ? "Element not found" : "Element found at index: " + index);
    }
}
