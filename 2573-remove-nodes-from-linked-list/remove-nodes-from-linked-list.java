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
        Deque<Integer> dq = new ArrayDeque<>();
        while(head != null){
            while(!dq.isEmpty() && head.val > dq.peekLast())
                dq.pollLast();
            dq.addLast(head.val);
            head = head.next;
        }
    
        ListNode h = new ListNode(0);
        ListNode temp = h;
        while(!dq.isEmpty()){
            ListNode t = new ListNode(dq.pollFirst());
            temp.next = t;
            temp = temp.next;
        }
        return h.next;
    }
}