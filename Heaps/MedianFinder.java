package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else{
            if(num<maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }

        // balance the heaps
        if(maxHeap.size()==minHeap.size()+2){
            int top = maxHeap.remove();
            minHeap.add(top);
        }
        if(minHeap.size()==maxHeap.size()+2){
            int top = minHeap.remove();
            maxHeap.add(top);
        }
    }

    public double findMedian() {
        if(maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else if(maxHeap.size() > minHeap.size())
            return maxHeap.peek();
        else
            return minHeap.peek();
    }
}
