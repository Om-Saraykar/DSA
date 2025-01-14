package Linked_List;

public class RemoveNthFromEnd {
    // one pointer approach
    public static Node removeFromEnd2(Node head, int n){
        // calculate no. of elements
        int length = 0;
        Node temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        // calculate index
        int idx = length - n;
        if(idx == 0) return head.next;
        // go to index - 1
        temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    // two pointer approach
    public static Node removeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtTail(70);

        int n = 7;
        list.display();
        System.out.println("n = " + n);
        list.head = removeFromEnd(list.head, n);
        list.display();
    }
}