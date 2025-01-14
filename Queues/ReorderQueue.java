package Queues;
import java.util.*;

public class ReorderQueue {

    private static void reverseStack(Stack<Integer> st){
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        while(!st.isEmpty()) temp1.push(st.pop());
        while(!temp1.isEmpty()) temp2.push(temp1.pop());
        while(!temp2.isEmpty()) st.push(temp2.pop());
    }

    // noob method
    private static void reorderQueue1(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        int n = queue.size()/2;
        for(int i=1; i<=n; i++){
            st.push(queue.remove());
        }
        reverseStack(st);
        for(int i=1; i<=n; i++){
            queue.add(st.pop());
            queue.add(queue.remove());
        }
    }

    // good method
    private static void reorderQueue2(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        int n = queue.size()/2;

        for(int i = 0; i <= n; i++){
            st.push(queue.remove());
        }

        while(st.size()>0){
            queue.add(st.pop());
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println(queue);
        reorderQueue2(queue);
        System.out.println(queue);
    }

}

// 1 2 3 4 5 6 7 8
// 1 5 2 6 3 7 4 8

// 4 3 2 1

// 8 4 7 3 6 2 5 1

// 8
// 7
// 6
// 5
