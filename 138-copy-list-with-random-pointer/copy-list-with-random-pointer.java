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
        Node deepCopyHead = new Node(0);
        Node dummyNode = deepCopyHead;
        Node t = head;
        HashMap<Node, Node> mp = new HashMap<>();
        while(t != null){
            Node temp = new Node(t.val);
            dummyNode.next = temp;
            mp.put(t, temp);
            t = t.next;
            dummyNode = dummyNode.next;
        }
        mp.put(null, null);
        dummyNode.next = null;
        t = head;
        dummyNode = deepCopyHead.next;
        while(t != null){
            dummyNode.random = mp.get(t.random);
            dummyNode = dummyNode.next;
            t = t.next;
        }
        return deepCopyHead.next;
    }
}