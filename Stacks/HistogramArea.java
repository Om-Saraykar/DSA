package Stacks;
import java.util.Stack;

public class HistogramArea {
    public static int[] previousSmallerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[0] = -1;
        st.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            while(st.size()>0 && st.peek()>arr[i])
                st.pop();
            if(st.size()==0) {
                res[i] = -1;
                st.push(arr[i]);
            }
            else if(st.peek()<arr[i]){
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return res;
    }
    public static int[] nextSmallerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && st.peek()>arr[i])
                st.pop();
            if(st.isEmpty()){
                res[i] = -1;
                st.push(arr[i]);
            }
            else if(st.peek()<arr[i]){
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return res;
    }
    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int[] previousSmallerIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[0] = -1;
        st.push(0);
        for(int i=1; i<arr.length; i++){
            while(st.size()>0 && arr[st.peek()]>arr[i])
                st.pop();
            if(st.size()==0){
                res[i] = -1;
                st.push(i);
            }
            else if(arr[st.peek()]<arr[i]){
                res[i] = st.peek();
                st.push(i);
            }
        }
        return res;
    }
    public static int[] nextSmallerIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n-1] = -1;
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[st.peek()]>arr[i])
                st.pop();
            if(st.isEmpty()){
                res[i] = -1;
                st.push(i);
            }
            else if(arr[st.peek()]<arr[i]){
                res[i] = st.peek();
                st.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
//        int[] res1 = previousSmallerElement(arr);
//        int[] res2 = nextSmallerElement(arr);
        int[] res3 = previousSmallerIndex(arr);
        int[] res4 = nextSmallerIndex(arr);
        printArray(arr);
//        printArray(res3);
//        printArray(res4);

        int[] res = new int[arr.length];
        int area, prevIndex, nextIndex;
        for(int i=0; i<res.length; i++){
            prevIndex = res3[i]; nextIndex = res4[i];
            if(nextIndex==-1) nextIndex = arr.length;
            area = arr[i]*(nextIndex-prevIndex-1);
            res[i] = area;
        }
        printArray(res);
    }
}
