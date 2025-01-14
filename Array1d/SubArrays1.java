// prefix method -> time complexity -> n^2
package Array1d;

public class SubArrays1 {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        // make prefix array
        int perfix_sum = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i] + perfix_sum;
            perfix_sum = arr[i];
        }

        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // calculate maximum sub-array sum
        int maxi=Integer.MIN_VALUE, sum;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = i==0 ? arr[j] : arr[j] - arr[i-1];
                if(sum>maxi) maxi = sum;
            }
        }

        // display output
        System.out.println("Maximum sub-array sum is "+ maxi);
    }
}