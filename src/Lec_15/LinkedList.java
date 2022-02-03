package Lec_15;

public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next=null;
        }

    }

    Node head;
    Node tail;
    int size=0;

//    Addtion
    public void addFirst(int data)
    {
        Node newnode = new  Node(data);
        if(size == 0) {
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void addLast(int data)
    {
        Node newnode = new Node(data);
        if (size==0)
            addFirst(data);
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void addindex(int data , int index) throws Exception {
        if (index ==0)
            addFirst(data);
        if (index == size)
            addLast(data);
        Node PrevIndex = getNode(index-1);
        Node newnode = new Node(data);
        newnode.next = PrevIndex.next;
        PrevIndex.next = newnode;
        size++;
    }

    //2.Getting A Element

    public int getFirst() throws Exception
    {
        if (size==0)
            throw new Exception("hattt ja mope na h kach bhi");
        return head.data;
    }

    public int getLast() throws  Exception
    {
        if (size==0)
            throw new Exception("hattt ja mope na h kach bhi");
        return tail.data;
    }

    public int getAnyIndex(int index) throws  Exception
    {
        if (index<0 || index>size)
            throw new Exception("chuitya h kya");
        if (size==0)
            throw new Exception("kuch bhi ni dunga tujhe");
        return getNode(index).data;

    }

    public Node getNode(int index) throws Exception {
        if (index<0 || index >size)
            throw new Exception("chuitya h kya");

        Node temp = head;
        for(int i = 1;i<=index;i++)
        {
            temp = temp.next;
        }
        return temp;

    }

    //Remove tye element

    public int removeFirst() throws Exception {
        if(size==0)
            throw new Exception("khali hu me kha se remove kru btttaaaaa");
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast() throws  Exception
    {
        if(size==0)
            throw new Exception("khali hu me kha se remove kru btttaaaaa");
        int val = tail.data;
        Node preLast = getNode(size-2);
        preLast.next = null;
        tail = preLast;
        size--;
        return val;
//        Node temp = head;
//        while(temp.next.next!=null)
//        {
//            temp=temp.next;
//        }
//        int val2 = temp.next.data;
//        temp.next=null;
//        return val2;
    }

    public int removeAnyIndex(int index) throws Exception
    {
        if (index<0 || index>size)
            throw new Exception("chuitya h kya");
        if (size==0)
            throw new Exception("kuch bhi ni dunga tujhe");
        Node pre = getNode(index-1);
        Node curr = getNode(index);
        int val = pre.next.data;
        pre.next = pre.next.next;
//        pre.next.next = null;
        return val;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("..");


    }
}
