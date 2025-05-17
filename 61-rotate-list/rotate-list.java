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
    int len(ListNode head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int l = len(head);
        if(l <= 1) return head;
        ListNode t = head;
        k = k % l;
        if(k == 0)
            return head;
        int d = l - k - 1;
        for(int i = 0; i < d; i++){
            t = t.next;
        }   
        
        ListNode t1 = t.next;
        ListNode ans = t1;
        t.next = null;
        while(t1 != null && t1.next != null) t1 = t1.next;
        t1.next = head;
        return ans;
    }
}