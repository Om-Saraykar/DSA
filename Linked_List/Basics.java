package Linked_List;

public class Basics {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(12);
        Node c = new Node(15);
        Node d = new Node(17);
        Node e = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        // printing linked list using function
        print(a);

        // print using recursion
        displayRecursive(a);
        System.out.println();
    }
    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void displayRecursive(Node pt){
        // base call
        if (pt == null) {
            return;
        }
        // kaam
        System.out.print(pt.val+" ");
        // recursive call
        displayRecursive(pt.next);
    }

}
