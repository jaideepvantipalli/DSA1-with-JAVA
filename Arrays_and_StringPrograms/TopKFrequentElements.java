import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        System.out.println("Enter K value : ");
        int k = sc.nextInt();
        
        ArrayList<Integer> res = findTopK(a, n, k);
        for(int x : res) System.out.print(x + " ");
        sc.close();
    }

    public static ArrayList<Integer> findTopK(int[] a, int n, int k){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : a) freq.put(num, freq.getOrDefault(num, 0) + 1);

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Sort());

        for(Map.Entry<Integer,Integer> e : freq.entrySet()){
            pq.add(new int[]{e.getKey(), e.getValue()});
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<k && !pq.isEmpty(); i++){
            int[] cur = pq.poll();
            ans.add(cur[0]);
        }
        return ans;
    }
}
class Sort implements Comparator<int[]> {
    public int compare(int[] a, int[] b){
        if(a[1] == b[1])
            return b[0] - a[0]; 
        return b[1] - a[1];     
    }
}