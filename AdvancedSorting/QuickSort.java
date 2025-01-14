package AdvancedSorting;
import static Noice.Print.print;

public class QuickSort {
    public static void quickSort(int[] arr, int lo, int hi){
        // base case
        if(lo>=hi) return;

        // recursive case
        int pivot = partition(arr, lo, hi);
        quickSort(arr, lo, pivot-1);
        quickSort(arr, pivot+1, hi);

    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[hi];
        int i = lo-1; // to place elements smaller than pivot
        for(int j=lo; j<hi; j++){
            if(arr[j]<pivot){
                i++;
                // swap arr[i], arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1], arr[hi]
        int temp = arr[i+1];
        arr[i+1] = arr[hi];
        arr[hi] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
