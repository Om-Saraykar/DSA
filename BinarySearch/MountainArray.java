package BinarySearch;

public class MountainArray {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int peakIndex(int[] arr){
        int lo = 1, hi = arr.length-2;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
                lo = mid+1;
            else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
                hi = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,20,10};
        print(arr);
        int ans = peakIndex(arr);
        System.out.print(ans);
    }
}
