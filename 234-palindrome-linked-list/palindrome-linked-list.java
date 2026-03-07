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
    public ListNode getMiddle(ListNode head){
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
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
    public boolean isPalindrome(ListNode head) {
        // find the middle
        // reverse the 2nd half
        // Now Compare

        ListNode mid = getMiddle(head);

        ListNode reverseHead = reverse(mid);
        
        while(head != null && reverseHead != null){
            if(head.val != reverseHead.val) return false;
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return (reverseHead == null);
    }
}