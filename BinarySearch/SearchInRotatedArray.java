package BinarySearch;

public class SearchInRotatedArray {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int binarysearch(int[] arr, int lo, int hi, int target){
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return -1;
    }
    public static int search1(int[] arr, int target){
        // linear search for n<=2
        int n = arr.length;
        if(n<=2){
            for(int i=0; i<n; i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }
        // find pivot
        int lo = 1, hi = n-2;
        int p = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                p = mid;
                break;
            }
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                p = mid-1;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                if(arr[mid]>arr[n-1]) lo = mid+1;
                else hi = mid-1;
            }
        }
        // if array was never rotated
        if(p == -1){
            return binarysearch(arr,0,n-1,target);
        }
        // search in both sub arrays
        int idx = binarysearch(arr, 0, p, target);
        if(idx == -1)
            idx = binarysearch(arr, p+1, n-1, target);
        // return index
        return idx;
    }
    public static int search(int[] arr, int target){
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) return mid;
            // mid is in right sorted space
            else if(arr[mid]<=arr[hi]){
                // check if between mid and hi
                if(target>=arr[mid] && target<=arr[hi]) lo = mid+1;
                else hi = mid-1;
            }
            // mid is in left sorted space
            else{
                // check if between lo and mid
                if(target>=arr[lo] && target<=arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,1,2,3,4,5,6};
        int target = 1;
        print(arr);
        int ans = search(arr, target);
        System.out.println(ans);
    }
}