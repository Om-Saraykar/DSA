package Array1d;

public class NextGreatestElement {
    public static void print(int[] arr){
        for(int ele: arr)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static void greatestElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int nge = arr[n-1];
        ans[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        print(ans);
    }
    public static void main(String[] args) {
        int[] arr = {12,8,41,60,2,49,16,28,21};
        print(arr);
        greatestElement(arr);
    }
}
