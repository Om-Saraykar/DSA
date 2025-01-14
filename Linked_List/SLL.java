package Linked_List;

// user defined data structure
public class SLL {
    Node head;
    Node tail;
    int size;

    void insertAtHead(int val){
        Node temp = new Node(val);
        // if LinkedList is empty
        if(head==null) head = tail = temp;
            // if LinkedList is not empty
        else{
            temp.next = head;
            head = temp;
        }
        size++;

    }
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
    void insert(int idx, int val){
        // at head
        if(idx==0){
            insertAtHead(val);
            return;
        }
        // at tail
        if(idx==size){
            insertAtTail(val);
            return;
        }
        // invalid index
        if (idx>size || idx<0) {
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        // Node x to travel to location
        Node x = head;
        // go to the index-1
        for(int i=0; i<=idx-1; i++){
            x = x.next;
        }
        // insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Exception{
        // if idx==tail: no need to travel
        if(idx==size-1){
            return tail.val;
        }
        // Invalid Input
        if(idx>=size || idx<0){
            throw new Exception("Bhai Index out of bound!");
        }
        // travel to that node
        Node x = head;
        for(int i=0; i<idx; i++){
            x = x.next;
        }
        // return value
        return x.val;
    }
    void set(int idx, int val){
        Node x = head;
        for(int i=0; i<=idx-1; i++){
            x = x.next;
        }
        x.val = val;
    }
    void deleteAtHead(){
        head = head.next;
        size--;
    }
    void deleteAtTail(){
        Node x = head;
        for(int i=0; i<size-2; i++){
            x = x.next;
        }
        x.next = null;
        tail = x;
        size--;
    }
    void delete(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        else if(idx==size-1){
            deleteAtTail();
            return;
        }
        Node x = head;
        for(int i=0; i<idx-1; i++){
            x = x.next;
        }
        x.next = x.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size is " + size);
    }
}