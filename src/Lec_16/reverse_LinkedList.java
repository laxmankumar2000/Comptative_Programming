package Lec_16;

import Lec_16.LinkedList_SourceFile;
public class reverse_LinkedList {
    public class Node{
        int data;
        LinkedList_SourceFile.Node next;

        public Node(int data)
        {
            this.data = data;
            next=null;
        }

    }

    public static void main(String[] args) {
        LinkedList_SourceFile obj = new LinkedList_SourceFile();


        obj.addFirst(10);
        obj.addLast(20);
        obj.addLast(30);
        obj.addLast(40);
        obj.reverse();
        obj.display();

    }

//    public LinkedList_SourceFile.Node reverse()
//    {
//        LinkedList_SourceFile.Node pre = null;
//        LinkedList_SourceFile.Node curr = head;
//        while(curr!=null)
//        {
//            LinkedList_SourceFile.Node ahead = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = ahead;
//        }
//        return pre;
//    }


}
