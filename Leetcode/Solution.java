package Leetcode;
import ArrayLists.A;
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        while(i<nums.length && k>0 && nums[i]<0) {
            nums[i] *= -1;
            k--; i++;
        }

        if(k%2 == 1) {
            Arrays.sort(nums);
            nums[0] *= -1;
        }

        // calculate sum
        int sum = 0;
        for(int ele:  nums) sum += ele;
        return sum;
    }
}
