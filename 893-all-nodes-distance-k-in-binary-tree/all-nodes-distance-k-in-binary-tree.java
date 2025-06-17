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
    void inorder(TreeNode root, Map<TreeNode, TreeNode> mp){
        if(root == null)
            return;
        if(root.left != null)
            mp.put(root.left, root);
        if(root.right != null)
            mp.put(root.right, root);
        inorder(root.left, mp);
        inorder(root.right, mp);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<TreeNode> dq = new ArrayDeque<>();
        Map<TreeNode, TreeNode> mp = new HashMap<>();
        Set<TreeNode> visited = new HashSet<>();
        inorder(root, mp);
        if(target == null)
            return ans;
        dq.add(target);
        visited.add(target);
        for(int i = 0; i < k; i++){
            int sz = dq.size();
            for(int j = 0; j < sz; j++){
                TreeNode t = dq.pop();
                if(t.left != null && !visited.contains(t.left)){
                    dq.add(t.left);
                    visited.add(t.left);
                }
                if(t.right != null && !visited.contains(t.right)){
                    dq.add(t.right);
                    visited.add(t.right);
                }
                if(mp.containsKey(t) && !visited.contains(mp.get(t)) ){
                    dq.add(mp.get(t));
                    visited.add(mp.get(t));
                }
            }
        }
        while(!dq.isEmpty()){
            TreeNode t = dq.pop();
            ans.add(t.val);
        }
        return ans;
    }
}