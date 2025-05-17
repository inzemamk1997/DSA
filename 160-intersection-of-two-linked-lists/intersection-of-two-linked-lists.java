/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode tA = headA;
        ListNode tB = headB;
        while(tA != null){
            tA = tA.next;
            lenA++;
        }
        while(tB != null){
            tB = tB.next;
            lenB++;
        }
        if(lenA < lenB){
            tA = headA;
            headA = headB;
            headB = tA;
        }

        int diff = Math.abs(lenA - lenB);
        for (int i = 0; i < diff; i++)
            headA = headA.next;


        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}