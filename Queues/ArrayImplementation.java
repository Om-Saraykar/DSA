package Queues;

public class ArrayImplementation {
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr = new int[100];

    public void add(int val){
        if(rear == arr.length-1){
            System.out.println("Queue is full!");
            return;
        }
        if(front == -1) {
            front = rear = 0;
            arr[rear] = val;
            size++;
            return;
        }
        arr[++rear] = val;
        this.size++;
    }

    public int remove(){
        if(this.size==0){
            System.out.println("Queue is empty!");
            return -1;
        }
        else if(this.size==1) {
            int x = arr[front];
            front = rear = -1;
            size--;
            return x;
        }
        front++; this.size--;
        return arr[front-1];
    }

    public int peek(){
        if(size==0){
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public void print(){
        if(front==-1){
            System.out.println("Queue is empty!");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayImplementation q = new ArrayImplementation();
        q.add(20);
        q.add(30);
        q.add(40);
        q.print();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.print();
        System.out.println(q.peek());
    }
}
