import java.util.*;

public class TernarySearchIndexRecursive {
    public static int ternarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid1 = low + (high - low) / 3;
        int mid2 = high - (high - low) / 3;

        if (arr[mid1] == target) return mid1;
        if (arr[mid2] == target) return mid2;

        if (target < arr[mid1])
            return ternarySearch(arr, low, mid1 - 1, target);
        else if (target > arr[mid2])
            return ternarySearch(arr, mid2 + 1, high, target);
        else
            return ternarySearch(arr, mid1 + 1, mid2 - 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = ternarySearch(arr, 0, n - 1, target);
        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);
    }
}
