package ec1;

public class reverse_linked_list {
    //reverse the list in order and return the new head of the list

    // New head is the original tail. We can iterate through the list but change direction
    // of the pointers, node should point to the one before it

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode prev = null;
            while (current != null) {
                ListNode next = current.next; //saves the next node so that we can continue looping
                current.next = prev; // the node after current points at current
                prev = current; //move prev cursor to next node
                current = next; // move curr cursor to next node
            }
            return prev; // loop ends when current is null (no more nodes), so node before current is the tail / head
            // of reversed list
        }
    }
}
