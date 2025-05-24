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

    public ListNode merge(ListNode h1, ListNode h2){
        ListNode head = new ListNode(0);
        ListNode currTemp = head;

        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                currTemp.next = h1;
                h1 = h1.next;
            }
            else{
                currTemp.next = h2;
                h2 = h2.next;
            }
            currTemp = currTemp.next;
        }

        if(h1 != null){
            currTemp.next = h1;
        }
        if(h2 != null)
            currTemp.next = h2;
        return head.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = null;
        if(prev.next != null){
            prev.next = null;
            left = sortList(head);
        }
        ListNode right = sortList(slow);
        return merge(left, right);

    }
}