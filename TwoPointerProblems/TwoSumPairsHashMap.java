import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class TwoSumPairsHashMap {
    public static List<List<Integer>> twoSumHash(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(complement);
                pair.add(arr[i]);
                res.add(pair);
            }
            map.put(arr[i], i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        sc.close();
        System.out.println(twoSumHash(arr, target));
    }
}
