package ec1;

public class linked_list_cycle {

    public class Solution {
        public boolean hasCycle(ListNode head) {
            // by definition of cycle, there must be a path between any two nodes if the tree
            // contains a cycle
            // we can therefore set two pointers and keep moving them until they meet
            // if the pointers meet, then there must be a cycle
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
            }
        }
    }

