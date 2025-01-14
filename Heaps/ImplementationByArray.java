package Heaps;

class MinHeap{
    int[] arr;
    int size;

    // constructor
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    // add a element
    public void add(int num){
        if(size == arr.length){
            throw new RuntimeException("Heap is full!");
        }
        arr[size++] = num;
        upHeapify(size - 1);
    }

    // up-heapify
    public void upHeapify(int child){
        if (child==0) return;

        int parent = (child - 1)/2;
        if(arr[child] < arr [parent]){
            swap(child, parent);
            upHeapify(parent);
        }

    }

    // remove
    public int remove(){
        if(size == 0){
            throw new RuntimeException("Heap is empty!");
        }

        int peek = arr[0];
        swap(0, size - 1);
        size--;
        downHeapify(0);
        return peek;
    }

    // down-Heapify
    public void downHeapify(int parent){
        int leftChild = 2*parent + 1;
        int rightChild = 2*parent + 2;
        int smallest = parent;

        if(leftChild<size && arr[leftChild] < arr[smallest]) smallest = leftChild;
        if(rightChild<size && arr[rightChild] < arr[smallest]) smallest = rightChild;
        if(parent == smallest) return;
        swap(parent, smallest);
        downHeapify(smallest);
    }

    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int peek(){
        if (size == 0) {
            throw new RuntimeException("Array is empty, cannot peek.");
        }
        return arr[0];
    }

    public int size(){
        return size;
    }
}

public class ImplementationByArray {
    public static void main(String[] args) {
        MinHeap hp = new MinHeap(10);
        System.out.println(hp.peek());
    }
}
