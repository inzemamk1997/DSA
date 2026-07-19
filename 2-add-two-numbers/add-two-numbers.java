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
    int carry = 0;
    ListNode start = new ListNode();
    ListNode t = start;

    public void listHasStillNode(ListNode l){
        while(l != null){
            if(carry == 0){
                t.next = l;
                break;
            }
            int sum = l.val + carry;
            carry = sum/10;
            sum = sum % 10; 
            t.next = new ListNode(sum);
            t = t.next;
            l = l.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum/10;
            sum = sum % 10; 
            t.next = new ListNode(sum);
            t = t.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 != null){
            //System.out.println("function called");
            listHasStillNode(l1);
        } 

        if(l2 != null){
            listHasStillNode(l2);
        } 
        
        if(carry != 0)
            t.next = new ListNode(carry);
        return start.next;
    }
}