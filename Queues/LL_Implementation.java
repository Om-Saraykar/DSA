package Queues;

public class LL_Implementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node node = new Node(val);
            size++;
            if(this.head == null) {
                this.head = node;
                this.tail = node;
                return;
            }
            this.tail.next = node;
            tail = tail.next;
        }

        public int remove() {
            if(size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public int peek() {
            if(size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }

        public void print() {
            if(head==null) System.out.println("Queue is empty!");
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.print();
        q.remove();
        q.print();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.print();
        q.remove();
        q.add(99);
        q.print();
        q.add(18);
        q.print();
        q.add(18);
        q.add(18);
        q.add(18);
        q.add(18);
        q.add(18);
        q.print();
        System.out.println(q.size);
    }
}


