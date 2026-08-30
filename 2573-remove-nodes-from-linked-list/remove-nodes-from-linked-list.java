/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> dq = new ArrayDeque<>();
        while(head != null){
            while(!dq.isEmpty() && head.val > dq.peekLast().val)
                dq.pollLast();
            if(!dq.isEmpty())
                dq.peekLast().next = head;
            dq.addLast(head);
            head = head.next;
        }
        if(!dq.isEmpty())
            return dq.peekFirst();
        return null;
    }
}