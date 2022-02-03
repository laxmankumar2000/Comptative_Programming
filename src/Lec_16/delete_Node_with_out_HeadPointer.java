package Lec_16;

public class delete_Node_with_out_HeadPointer {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
