package Sorting;

public class ConvertArray {
    public static void conversion(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int mini = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]<mini && arr[j]>0){
                    mini = arr[j];
                    mindex = j;
                }
            }
            arr[mindex] = count;
            count--;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = -arr[i];
        }
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 47, 91, 63};
        print(arr);
        conversion(arr);
        print(arr);
    }
}
