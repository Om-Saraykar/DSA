package Array1d;

import java.util.Arrays;

public class ArrayInbuilt {
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,2,3,1,8,9,8,7,5};

        // length of array
        int n = arr.length;
        System.out.println("Length of array is " + n);

        // inbuilt sorting
        Arrays.sort(arr);

        // for each loop
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        // deep copy of array (for user defined deep copy -> copy each element using loop)
        int[] brr = Arrays.copyOf(arr, arr.length);

    }
}