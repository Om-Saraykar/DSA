package Queues;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);

    }
}

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        // constructor
    }

    public void push(int x) {
        if(q2.isEmpty()){
            q1.add(x);
        }
        else{
            q2.add(x);
        }
    }

    public int pop() {
        if(q2.isEmpty()){
            while(q1.size() != 1) q2.add(q1.remove());
            return q1.remove();
        }
        else{
            while(q2.size() != 1) q1.add(q2.remove());
            return q2.remove();
        }
    }

    public int top() {
        if(q2.isEmpty()){
            while(q1.size() != 1) q2.add(q1.remove());
            int x = q1.remove();
            q2.add(x);
            return x;
        }
        else{
            while(q2.size() != 1) q1.add(q2.remove());
            int x = q2.remove();
            q1.add(x);
            return x;
        }
    }

    public boolean empty() {
        if(q2.isEmpty()) return q1.size()==0;
        else return q2.size()==0;
    }
}