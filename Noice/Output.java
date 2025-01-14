package Noice;

public class Output {
    Node head;
    Node tail;
    int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        // if LinkedList is empty
        if(head==null) head = tail = temp;
        // if LinkedList is not empty
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void transverse(){
        while (head != null && head.next != null) {
            System.out.print(head.val + " ");
            head = head.next.next;
        }
    }
    public static void main(String[] args) {
        Output list = new Output();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.display();
        list.transverse();
    }
}

class Node{
    int val;
    Node next;
    Node(int data){
        this.val = data;
    }
}
