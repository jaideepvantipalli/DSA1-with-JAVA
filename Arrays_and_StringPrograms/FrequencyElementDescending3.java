import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
public class FrequencyElementDescending3{
        public static void main(String args[])
        {
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
class Main{
    public static ArrayList<Integer> SortByFreq(int a[],int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:a) hm.put(i,hm.getOrDefault(i,0)+1);
        PriorityQueue<ArrayList<Integer>> pq= new PriorityQueue<>(new Sort());
        for(Map.Entry<Integer,Integer> e: hm.entrySet())
        {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(e.getValue());
            al.add(e.getKey());
            pq.offer(al);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size()>0)
        {
            ArrayList<Integer> res = pq.poll();
            int c=res.get(0);
            int x =res.get(1);
            for(int j=0;j<c;j++) ans.add(x);
        }
        return ans;
    }
}
class Sort implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
        if(a.get(0).equals(b.get(0)))
        return a.get(1)-b.get(1);
        return b.get(0)-a.get(0);
    }
}
