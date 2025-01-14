package Linked_List;

import java.util.ArrayList;

public class SplitList {
    public static Node[] splitListToParts(Node head, int k){
        int ori = k;
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int num = length/k;
        int plus = length%k;
        int number = 0;

        Node a = head;
        Node b = head;
        ArrayList<Node> answer = new ArrayList<>();
        while(k!=0){
            if(plus>0) number = num+1;
            else number = num;
            for(int i=1; i<number; i++){
                a = a.next;
            }
            plus--; k--;
            b = a.next;
            a.next = null;
            answer.add(head);
            a = b;
            head = b;
        }
        
        // Convert ArrayList to Node array using toArray(T[] a)
        Node[] array1 = new Node[ori];
        array1 = answer.toArray(array1);


        return array1;
    }

    public static void main(String[] args){
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtTail(80);
        Node[] array = splitListToParts(list.head, 3);

        for(Node head : array) {
            Node temp = head;
            System.out.print("[");
            while(temp!=null){
                System.out.print(temp.val + ",");
                temp = temp.next;
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
