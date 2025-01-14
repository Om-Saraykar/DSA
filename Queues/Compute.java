package Queues;
import java.util.*;

// Geeks for Geeks
class Compute {
    public long[] printFirstNegativeInteger(long A[], int N, int K){
        long[] res = new long[N - K + 1];
        Queue<Integer> queue = new LinkedList<>();

        // add -ve value indices in queue
        for(int i=0; i<N; i++){
            if(A[i] < 0) queue.add(i);
        }

        for(int i=0; i<N-K+1; i++){
            if(queue.size()>0 && queue.peek() < i) queue.remove();

            if(!queue.isEmpty() && queue.peek() < i+K-1) res[i] = A[queue.peek()];
            else res[i] = 0;
        }
        return res;
    }
}

