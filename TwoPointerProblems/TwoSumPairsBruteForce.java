import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TwoSumPairsBruteForce {
    public static List<List<Integer>> twoSumBruteforce(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (arr[i] + arr[j] == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    res.add(pair);
                }
            }
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
        System.out.println(twoSumBruteforce(arr, target));
    }
}
