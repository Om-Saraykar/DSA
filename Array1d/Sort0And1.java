package Array1d;

public class Sort0And1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};
        print(arr);
        twoPass(arr);
        onePass(arr);
    }
    public static void onePass(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++; j--;
            }
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
        }
        print(arr);
    }
    public static void twoPass(int[] arr){
        int noOfZeroes = 0;
        for(int element: arr){
            if(element == 0)
                noOfZeroes++;
        }
        for(int i=0; i<arr.length; i++){
            if(i<noOfZeroes)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int ele: arr)
            System.out.print(ele + " ");
        System.out.println();
    }
}