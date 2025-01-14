package BinarySearch;
import java.util.ArrayList;
import java.util.List;

public class KClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x){
        List<Integer> ans = new ArrayList<>();
        // find lower bound
        int n = arr.length;
        int lo = 0, hi = n-1;
        int lb = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb, mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,10};
        int k = 3;
        int x = 6;
        List<Integer> ans = findClosestElements(arr,k,x);
        System.out.println(ans);
    }
}
