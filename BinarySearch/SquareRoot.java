package BinarySearch;

public class SquareRoot {
    public static int mySqrt(int x){
        // using binary search
        int lo = 1, hi = x;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid==x/mid) return mid;
            else if(mid > x/mid) hi = mid-1;
            else lo = mid+1;
        }
        return hi;
    }
    public static void main(String[] args) {
        int n = 0;
        int ans = mySqrt(n);
        System.out.println(ans);
    }
}