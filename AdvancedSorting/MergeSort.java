package AdvancedSorting;
import Noice.Print;

public class MergeSort {
    public static void mergeSort(int[] arr, int lo, int hi){
        // base case
        if(lo>=hi) return;

        // recursive case
        int mid = lo + (hi-lo)/2;
        mergeSort(arr, lo, mid); // left part
        mergeSort(arr, mid+1, hi); // right part
        merge(arr, lo, mid, hi);
    }
    public static void merge(int[] arr, int lo, int mid, int hi){
        int[] temp = new int[hi-lo+1];
        int i = lo; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp arr

        // sort
        while(i<=mid && j<=hi){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part leftover
        while(i<=mid) temp[k++] = arr[i++];

        // right part leftover
        while(j<=hi) temp[k++] = arr[j++];

        // copy temp to original arr
        for(k=0, i=lo; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        Print.print(arr);
        mergeSort(arr, 0, arr.length - 1);
        Print.print(arr);
    }
}