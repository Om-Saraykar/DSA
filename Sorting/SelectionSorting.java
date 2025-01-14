package Sorting;

public class SelectionSorting {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int mini = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<mini){
                    mini = arr[j];
                    mindx = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {56,23,48,95,61,27,50,46,76,69};
        print(arr);
        selectionSort(arr);
        print(arr);
    }
}
