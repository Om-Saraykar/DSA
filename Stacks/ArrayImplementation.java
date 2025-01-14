package Stacks;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[50];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx++] = x;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack Underflow Exception");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack Underflow Exception");
                return -1;
            }
            int x = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return x;
        }
        void display(){
            System.out.print("[");
            for(int i=0; i<size(); i++){
                if(i==size()-1){
                    System.out.print(arr[i] + "]");
                    break;
                }
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            return size() == 0;
        }
        boolean isFull(){
            return size() == arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.push(90);
        st.push(80);
        st.push(70);
        st.display();
    }
}