/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool solve(TreeNode* root, long minVal, long maxVal){
        if(root == nullptr)
            return true;
        if(root->val <= minVal || root->val >= maxVal)
            return false;
        
        return solve(root->left, minVal, root->val) && solve(root->right, root->val, maxVal);
    }
    bool isValidBST(TreeNode* root) {
       long minVal = LONG_MIN;
       long maxVal = LONG_MAX;

       return solve(root, minVal, maxVal);
    }
};