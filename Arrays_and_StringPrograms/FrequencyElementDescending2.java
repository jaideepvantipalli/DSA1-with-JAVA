import java.util.*;
public class FrequencyElementDescending2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter Array elements : ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        
        ArrayList<Integer> res=Main.SortByFreq(a,n);
        System.out.println("Sorted List : ");
        for(int i:res) System.out.print(i+" ");
        sc.close();
    }
}

class Main {
    public static ArrayList<Integer> SortByFreq(int a[], int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : a) hm.put(i, hm.getOrDefault(i, 0) + 1);

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Sort());
        
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            pq.add(new int[]{e.getKey(), e.getValue()});
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            int[] pair = pq.poll();
            int x = pair[0];
            int c = pair[1];
            for(int j=0; j<c; j++) ans.add(x);
        }
        return ans;
    }
}

class Sort implements Comparator<int[]> {
    public int compare(int[] a, int[] b){
        if(a[1] == b[1])
            return a[0]-b[0];
        return b[1] - a[1];
    }
}