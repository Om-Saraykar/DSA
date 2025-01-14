package Array1d;

public class Merge2SortedArrays {
    public static void print(int[] arr){
        for(int ele: arr)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static void mergeArray(int[] arr, int[] brr){
        int[] ans = new int[arr.length + brr.length];
        int i=0, j=0, k=0;
        while(j<arr.length && k<brr.length){
            if(arr[j]<brr[k]){
                ans[i] = arr[j];
                j++;
            }
            else{
                ans[i] = brr[k];
                k++;
            }
            i++;
        }
        // leftover arr
        while(j<arr.length){
            ans[i] = arr[j];
            j++;i++;
        }
        // leftover brr
        while(k<brr.length){
            ans[i] = brr[k];
            k++;i++;
        }
        print(ans);
    }
    public static void main(String[] args) {
        int[] arr = {11,33,42,71};
        int[] brr = {26,54,69,81,94};
        mergeArray(arr, brr);
    }
}