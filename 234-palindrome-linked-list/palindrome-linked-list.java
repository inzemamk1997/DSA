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
    boolean isPalindromeString(StringBuilder s){
        int n = s.length();
        int i = 0, j = n - 1;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder("");
        ListNode t = head;
        while(t != null){
            s.append(t.val);
            t = t.next;
        }

        return isPalindromeString(s);
    }
}