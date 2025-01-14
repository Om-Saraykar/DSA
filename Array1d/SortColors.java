package Array1d;

public class SortColors {
    public static void print(int[] arr){
        for(int ele: arr)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static void twoPass(int[] arr){
        int noOfZeroes = 0;
        int noOfOnes = 0;
        for(int element: arr){
            if(element == 0)
                noOfZeroes++;
            else if(element ==1)
                noOfOnes++;
        }
        for(int i=0; i<arr.length; i++){
            if(i<noOfZeroes) arr[i] = 0;
            else if(i<noOfZeroes+noOfOnes) arr[i] = 1;
            else arr[i] = 2;
        }
        print(arr);
    }
    public static void onePass(int[] arr){
        int lo = 0, mid = 0, hi = arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                arr[mid] = arr[lo];
                arr[lo] = 0;
                lo++; mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{ // arr[mid]==2
                arr[mid] = arr[hi];
                arr[hi] = 2;
                hi--;
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        // leetcode 75
        int[] arr = {0,1,2,2,1,2,1,2,0,0};
        print(arr);
        twoPass(arr);
        onePass(arr);
    }
}
