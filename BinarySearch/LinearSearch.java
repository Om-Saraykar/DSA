package BinarySearch;

import java.util.*;

public class LinearSearch {
    public static boolean linear_Search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key) 
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        sc.close();

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        if(linear_Search(arr, key)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}