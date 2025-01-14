package Queues;
import java.util.*;

public class ReverseQueue {
    private static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        while(!queue.isEmpty()) st.add(queue.remove());
        while(!st.isEmpty()) queue.add(st.pop());
    }
    private static void reverseKQueue(Queue<Integer> queue, int k){
        Stack<Integer> st = new Stack<>();
        int n = queue.size();

        for(int i=1; i<=k; i++){
            st.add(queue.remove());
        }
        while(!st.isEmpty()) queue.add(st.pop());
        for(int i=k; i<n; i++) queue.add(queue.remove());
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(10,20,30,40,50));
        System.out.println(q);
        reverseQueue(q);
        System.out.println(q);
        reverseKQueue(q, 2);
        System.out.println(q);
    }
}
