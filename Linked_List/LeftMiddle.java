package Linked_List;

public class LeftMiddle {
    public static int findLeftMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
//        list.insertAtTail(70);
//        list.insertAtTail(80);
        list.display();
        System.out.println(findLeftMiddle(list.head));
    }
}
