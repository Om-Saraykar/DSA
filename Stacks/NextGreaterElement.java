package Stacks;

import java.util.Stack;
public class NextGreaterElement{
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrayMethod(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        printArray(res);
    }
    public static void stackMethod(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
                st.push(arr[i]);
            }
            else {
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }
        printArray(res);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        printArray(arr);
        arrayMethod(arr); // time complexity O(n^2)
        stackMethod(arr); // time complexity O(n)
    }
}