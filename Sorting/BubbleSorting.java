package Sorting;
import java.util.Arrays;

public class BubbleSorting {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<=arr.length-2; i++){
            for(int j=0; j<=arr.length-2-i; j++){
                if(arr[j+1]<arr[j]){
                    // swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {56,23,48,95,61,27,50,46,76,69};
        print(arr);

        // inbuilt sort
        Arrays.sort(arr);
        print(arr);
        System.out.println();

        // bubble sort
        int[] brr = {56,23,48,95,61,27,50,46,76,69};
        print(brr);
        bubbleSort(brr);
        print(brr);
    }
}
