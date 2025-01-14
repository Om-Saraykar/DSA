package Stacks;

public class LinkedListImplementation {
    // user defined data type
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    // user defined data structure
    public static class Stack{
        Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        int peek(){
            return head.val;
        }
        int size(){
            return this.size;
        }
        void display(){
            Node newHead = reverseList(this.head);
            Node temp = newHead;
            System.out.print("[");
            while(temp!=null){
                if(temp.next==null) {
                    System.out.print(temp.val + "]");
                    break;
                }
                System.out.print(temp.val + " ,");
                temp = temp.next;
            }
            System.out.println();
            temp = reverseList(newHead);
        }
        Node reverseList(Node head){
            Node a = null;
            Node b = head;
            Node c;
            while(b!=null){
                c = b.next;
                b.next = a;
                a = b;
                b = c;
            }
            return a;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(15);
        st.push(25);
        st.push(35);
        st.push(45);
        st.push(55);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println("Size is " + st.size());
        st.display();
    }
}
