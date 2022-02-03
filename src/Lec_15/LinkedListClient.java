package Lec_15;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList obj = new LinkedList();
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addLast(30);
        obj.addindex(40,1);
        obj.addindex(50,1);
        System.out.println(obj.getNode(3).data);
        obj.display();
        System.out.println(obj.getNode(3).data);
        System.out.println(obj.getFirst() + " " + obj.getLast() + " " + obj.getAnyIndex(3));
        System.out.println();

        System.out.println(obj.removeFirst());
        obj.display();

        System.out.println(obj.removeLast());
        obj.display();

        System.out.println(obj.removeAnyIndex(1));
        obj.display();

    }
}
