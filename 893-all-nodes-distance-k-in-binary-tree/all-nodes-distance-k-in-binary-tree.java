/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();
    void inorder(TreeNode root){
        if(root == null)
            return;
        if(root.left != null){
            parent.put(root.left, root);
        }
        inorder(root.left);
        if(root.right != null){
            parent.put(root.right, root);
        }
        inorder(root.right);
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        inorder(root);
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(target);
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);
        while(!q.isEmpty() && k != 0){
            int n = q.size();            
            for(int i = 0; i < n; i++){  
                TreeNode curr = q.poll();
                if(curr.left != null && !visited.contains(curr.left)){                 
                    q.add(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right != null && !visited.contains(curr.right)){                 
                    q.add(curr.right);
                    visited.add(curr.right);
                }
                TreeNode p = parent.get(curr);
                if(p != null && !visited.contains(p)){
                    q.add(p);
                    visited.add(p);
                }
            }
            k--;
        }
        while(!q.isEmpty())
            ans.add(q.poll().val);
        return ans;
    }
}