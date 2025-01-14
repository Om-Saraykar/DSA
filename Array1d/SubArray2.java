package Array1d;

public class SubArray2 {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,3};
        int maxi = Integer.MIN_VALUE, sum=0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum<0) sum = 0;
            if(sum>maxi) maxi = sum;
        }
        System.out.println(maxi);
    }
}