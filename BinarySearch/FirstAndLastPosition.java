package BinarySearch;

public class FirstAndLastPosition {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int[] searchRange1(int[] arr, int target){
        int[] ans = {-1, -1};
        // search if element is present
        boolean flag = false;
        int hi = arr.length-1, lo = 0;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] > target){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        if(flag){
            // upper bound
            lo = 0; hi = arr.length-1;
            int lb = arr.length;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(arr[mid]>=target){
                    lb = Math.min(lb, mid);
                    hi = mid-1;
                }
                else lo = mid+1;
            }
            ans[0] = lb;
            // lower bound
            lo = 0; hi = arr.length-1;
            int ub = arr.length;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(arr[mid]>target){
                    ub = Math.min(ub, mid);
                    hi = mid-1;
                }
                else lo = mid+1;
            }
            ans[1] = ub-1;
        }
        return ans;
    }
    public static int[] searchRange(int[] arr, int target){
        int[] ans = new int[2];
        int n = arr.length;
        // find first position
        int fp = -1;
        int hi = n-1; int lo = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]) hi = mid-1;
                else{
                    fp = mid;
                    break;
                }
            }
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        ans[0] = fp;
        // find last position
        int lp = -1;
        hi = n-1; lo = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target){
                if(mid<n-1 && arr[mid]==arr[mid+1]) lo = mid+1;
                else{
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        ans[1] = lp;
        // return answer
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20,30,30,40,40};
        int target = 30;
        int[] ans = searchRange(arr, target);
        print(ans);
        int[] ans1 = searchRange1(arr, target);
        print(ans1);
    }
}
