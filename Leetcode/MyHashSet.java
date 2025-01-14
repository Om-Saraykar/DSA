package Leetcode;

class MyHashSet {
    int idx = 0;
    int[] arr;
    public MyHashSet() {
        int[] arr = new int[99999];
    }

    public void add(int key) {
        arr[idx] = key;
    }

    public void remove(int key) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                arr[i] = 0;
                break;
            }
        }
    }

    public boolean contains(int key) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                arr[i] = 0;
                return true;
            }
        }
        return false;
    }
}