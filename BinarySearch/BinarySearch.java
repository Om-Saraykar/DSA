package BinarySearch;
import java.util.Scanner;

public class BinarySearch {
    public static boolean binary_search(int[] arr, int key){
        int hi = arr.length-1, lo = 0;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] > key){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        if(binary_search(arr,key)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}