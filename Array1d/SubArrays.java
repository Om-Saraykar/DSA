// time complexity -> n^3

package Array1d;

public class SubArrays {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int mini=arr[arr.length-1];
        int maxi=arr[0];
        // or int maxi = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                if(sum>maxi){
                    maxi = sum;
                }
                if(sum<mini){
                    mini = sum;
                }
                System.out.print(" -> "+sum);
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("Minimum sum is "+mini);
        System.out.println("Maximum sum is "+maxi);
    }

}
