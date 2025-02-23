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
private:
    void inorderTraversal(TreeNode* root, vector<int> &in){
        if(root == nullptr)
            return;
        inorderTraversal(root->left, in);
        in.push_back(root->val);
        inorderTraversal(root->right, in);
    }
public:
    int kthSmallest(TreeNode* root, int k) {
        vector<int> in;
        inorderTraversal(root, in);
        if(in.size() >= k)
            return in[k-1];
        return -1;
    }
};