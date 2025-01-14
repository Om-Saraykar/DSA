package Queues;

// Leetcode 641
public class MyCircularDeque {
    int front, back, sizeOfQueue, lengthOfArray;
    int[] arr;

    public MyCircularDeque(int k) {
        lengthOfArray = k;
        arr = new int[k];
        front = back = -1;
        sizeOfQueue = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        if (isEmpty()) front = back = 0;
        else if (front == 0) front = lengthOfArray - 1;
        else front--;

        arr[front] = value;
        sizeOfQueue++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        if (isEmpty()) front = back = 0;
        else back = (back + 1) % lengthOfArray;
        arr[back] = value;
        sizeOfQueue++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (front == back) front = back = -1;
        else front = (front + 1) % lengthOfArray;
        sizeOfQueue--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (front == back)
            front = back = -1;
        else if (back == 0) back = lengthOfArray - 1;
        else back--;
        sizeOfQueue--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[back];
    }

    public boolean isEmpty() {
        return sizeOfQueue == 0;
    }

    public boolean isFull() {
        return sizeOfQueue == lengthOfArray;
    }
}
