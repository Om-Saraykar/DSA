package Array1d;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 5;

        Solution solution = new Solution();
        solution.rotatePro(nums, k);
    }
}
class Solution {
    public void rotatePro(int[] nums, int k){
        int n = nums.length;
        k %= n;
        int i = n-k, j = n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        i=0; j=n-1-k;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        i=0; j=n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // output
        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] sol = new int[n];

//        for(int i=0; i<k; i++) {
//            sol[i] = nums[n-k+i];
//        }
        if (k >= 0) System.arraycopy(nums, n-k+0, sol, 0, k);

//        for(int i=0; i<n-k; i++){
//            sol[k+i] = nums[i];
//        }
        if (n - k >= 0) System.arraycopy(nums, 0, sol, k+0, n - k);


        // output
        for(int ele : sol){
            System.out.print(ele+" ");
        }
    }
}