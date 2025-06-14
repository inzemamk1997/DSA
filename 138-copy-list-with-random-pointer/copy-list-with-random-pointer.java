/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummyNode = new Node(0);
        if(head == null)
            return null;
        Node currNode = head;
        while(currNode != null){
            Node copyNode = new Node(currNode.val);
            Node currNodeNext = currNode.next;
            currNode.next = copyNode;
            copyNode.next = currNodeNext;
            currNode = currNodeNext;
        }
        
        currNode = head;
        
        while(currNode != null && currNode.next != null){
            currNode.next.random = currNode.random != null ? currNode.random.next : null;
            currNode = currNode.next.next;  
        }
        
        currNode = head;
        Node temp = dummyNode;
        while(currNode != null){
            temp.next = currNode.next;
            currNode.next = currNode.next != null ? currNode.next.next : null;
            currNode = currNode.next;
            temp = temp.next;
        }
        temp.next = null;
        return dummyNode.next;
    }
}