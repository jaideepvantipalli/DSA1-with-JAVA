import java.util.*;

public class BinarySearchBooleanRecursive {
    public static boolean binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return true;
        else if (arr[mid] < target)
            return binarySearch(arr, mid + 1, high, target);
        else
            return binarySearch(arr, low, mid - 1, target);
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

        System.out.println("Element found: " + binarySearch(arr, 0, n - 1, target));
    }
}
