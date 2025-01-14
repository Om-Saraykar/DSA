package Array1d;

public class ReversedArray {
    public static void main(String[] args) {
        // sorted array is given
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
        int i=0, j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
