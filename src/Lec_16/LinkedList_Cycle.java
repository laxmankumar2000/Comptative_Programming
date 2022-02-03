package Lec_16;

public class LinkedList_Cycle {
    private class Node {

        int data;
        Node next;

        public Node(int item) {
            // TODO Auto-generated constructor stub
            this.data = item;
        }

        public Node() {
            // TODO Auto-generated constructor stub
        }

    }

    private Node head;
    private int size;
    private Node tail;

    // Addtion
    public void addFirst(int item) {
        Node nn = new Node(item);

        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            this.size++;

        }

    }

    public void addLAst(int item) {
        if (this.size == 0) {
            addFirst(item);

        } else {
            Node nn = new Node(item);
            this.tail.next = nn;
            this.tail = nn;
            this.size++;
        }

    }

    public void Create_Cycle() {
        this.tail.next = this.head;
    }

    public void display() {

        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(".");

    }

        public boolean hasCycle(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast)
                    return true;
            }
            return false;

        }

    public static void main(String[] args) {
        LinkedList_Cycle obj = new LinkedList_Cycle();
        obj.addFirst(10);
        obj.addLAst(20);
        obj.addLAst(30);
        obj.addLAst(40);
        obj.addLAst(50);
//        obj.Create_Cycle();
        System.out.println(obj.hasCycle(obj.head));
//        obj.display();

    }

}
