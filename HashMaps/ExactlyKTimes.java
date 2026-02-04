/*10. Consider Array of n elements, find frequency of each element.
        Print all the elements that occurs exactly k times */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class ExactlyKTimes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("Enter the K value for finding values :");
        int k=sc.nextInt();
        frequencyarr(arr,k);
        sc.close();
    }
    static void frequencyarr(int a[],int k){
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        System.out.println("Exactly "+k+" Times :");
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            Integer key=e.getKey();
            Integer value=e.getValue();
            if(value==k) System.out.println(key);
        }
    }
}