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
    int c = 0;
    void findPath(TreeNode* root, int targetSum, long currSum){
        if(root == nullptr)
            return;
        currSum += (long)root->val;
        if(currSum == targetSum)
            c++;
        findPath(root->left, targetSum, currSum );
        findPath(root->right, targetSum, currSum );

    }
public:
    int pathSum(TreeNode* root, int targetSum) {
        if(root == nullptr)
            return c;
        long currSum = 0;
        findPath(root, targetSum, currSum);
        pathSum(root->left, targetSum);
        pathSum(root->right, targetSum);
        return c;
    }
};