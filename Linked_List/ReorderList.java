package Linked_List;

public class ReorderList {
    public static void reverseList(Node head){

    }
    public static void reorderList(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow.next; // head of second linked list
        slow.next = null;
        reverseList(fast); // reverse second linked list

    }
    public static void main(String[] args) {
        SLL linkedList = new SLL();
        linkedList.insertAtTail(10);
        linkedList.insertAtTail(20);
        linkedList.insertAtTail(30);
        linkedList.insertAtTail(40);
        linkedList.insertAtTail(50);
        linkedList.display();
        reorderList(linkedList.head);
        linkedList.display();
    }
}
