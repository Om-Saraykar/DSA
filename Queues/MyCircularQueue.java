package Queues;

public class MyCircularQueue {
    int front, back, sizeOfQueue, lengthOfArray;
    int[] arr;
    public MyCircularQueue(int k) {
        lengthOfArray = k;
        arr = new int[k];
        front = back = -1;
        sizeOfQueue = 0;
    }

    public boolean enQueue(int value) {
        if(isEmpty()){
            front = 0; back = 0;
            arr[back] = value;
            sizeOfQueue++;
            return true;
        }
        if(isFull()) return false;
        back = (back + 1) % lengthOfArray;
        arr[back] = value;
        sizeOfQueue++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front + 1) % lengthOfArray;
        sizeOfQueue--;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return arr[back];
    }

    public boolean isEmpty() {
        return sizeOfQueue == 0;
    }

    public boolean isFull() {
        return sizeOfQueue == lengthOfArray;
    }
}

