package Sorting;

public class InsertionSorting {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if (arr[j]<arr[j-1]) {
                    // swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,9,1,3,4,7,10,6,2,8};
        print(arr);
        insertionSort(arr);
        print(arr);
    }
}
