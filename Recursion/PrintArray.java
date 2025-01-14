package Recursion;

public class PrintArray {
    public static void print(int[] arr, int n){
        // base case
        if(n<0){
            return;
        }
        // recursive call
        print(arr,n-1);
        System.out.print(arr[n] + " ");
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,3,8,6,9,3,6};
        print(arr, arr.length-1);
    }
}
