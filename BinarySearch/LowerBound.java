package BinarySearch;

public class LowerBound {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int lowerBound(int[] arr, int target){
        int lo = 0; int hi = arr.length-1;
        int lb = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb, mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return lb;
    }
    public static int upperBound(int[] arr, int target){
        int lo = 0; int hi = arr.length-1;
        int ub = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target){
                ub = Math.min(ub, mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ub;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int target = 30;
        print(arr);
        int ans = lowerBound(arr, target);
        System.out.println("lower bound is: " + ans);
        ans = upperBound(arr, target);
        System.out.println("upper bound is: " + ans);
    }
}