package Linked_List;

public class Implementation {
    public static void main(String[] args) throws Exception {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(24);
        list.insertAtHead(69);
        list.insert(2,15);
        list.insert(0,0);
        list.display();
        list.deleteAtHead();
        list.display();
        list.delete(2);
        list.display();
        list.deleteAtTail();
        list.display();
        System.out.println(list.tail.val);
        list.delete(2);
        list.display();
        System.out.println(list.tail.val);
    }
}