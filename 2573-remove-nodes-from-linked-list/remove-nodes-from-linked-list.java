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
    public ListNode reverse(ListNode head){
        ListNode curr = head, prev = null;
        while(curr != null){
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode h = reverse(head);
        ListNode t = h;
        int maxSoFar = 0;
        ListNode prev = null;
        while(h != null){
            if(h.val < maxSoFar){
                h = h.next;
            }else{
                maxSoFar = Math.max(maxSoFar, h.val);
                if(prev == null)
                    prev = h;
                else{
                    prev.next = h;
                    prev = prev.next;
                }
                h = h.next;
            }
        }
        prev.next = null;
        return reverse(t);
    }
}