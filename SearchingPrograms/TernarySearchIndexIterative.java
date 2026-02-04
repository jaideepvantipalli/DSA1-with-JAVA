import java.util.*;

public class TernarySearchIndexIterative {
    public static int ternarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == target) return mid1;
            if (arr[mid2] == target) return mid2;
            if (target < arr[mid1]) high = mid1 - 1;
            else if (target > arr[mid2]) low = mid2 + 1;
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
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

        int index = ternarySearch(arr, target);
        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);
    }
}
