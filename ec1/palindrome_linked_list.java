package ec1;

public class palindrome_linked_list {
    class Solution {
        // we can find the midpoint and then compare the two parts. But because we cannot
        // go back a node in singly linked lists, we must reverse the second part.
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode current = slow; // we found the midpoint with pointers
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next; //store the next one
            current.next = prev; // change direction of the pointer
            prev = current; // move prev forward
            current = next; // move curr forward
        }

        //now compare the two parts
        ListNode first = head; // pointer starts from head
        ListNode second = prev; // pointer starts from midpoint after inversion

        while (second != null) {
            //second half is potentially shorter, therefore we only check the second half for bounds
            if (first.val != second.val) { // if any two are different, they're false
                return false;
            }
            else {
                first = first.next;
                second = second.next;
            }
        }
        return true;
        }
    }
}

