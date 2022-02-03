package Lec_17;

public class cycle_remove {
    class node{
        int data;
        node next;
        public node(int data)
        {
            this.data = data;
            next = null;
        }

    }
    node head;
    node tail;
    public node MeetingPoint()
    {
        node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == slow)
                return slow;

        }
        return null;

    }

    public void removeCycle()
    {
        node meet = MeetingPoint();
        if (meet == null)
            return;
        node start = head;
        while(start != null)
        {
//            node temp =
        }
    }
    public node meetigPoint(node head)
    {
        node slow = head;
        node fast = head;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast =fast.next.next;
            if (fast == slow)
                return  slow;
        }
        return null;
    }

    public void flyoredCycleRemove(node head)
    {
        node meet = meetigPoint(head);
        if(meet==null)
            return;
        node slow =head;
        node fast = meet;
        while (slow !=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
}
