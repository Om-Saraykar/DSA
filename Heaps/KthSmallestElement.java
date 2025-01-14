package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            maxHeap.add(ele);
            if(maxHeap.size() > k) maxHeap.remove();
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {19,94,57,43,22,12,86,69};
        int answer = findKthLargest(arr, 3);
        System.out.println(answer);
    }
}
