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
    void findPathSum(TreeNode* root, int &targetSum, long currSum){
        if(root == nullptr){
            return; 
        }
        currSum += root->val;
        if(currSum == targetSum) {
            count++;
        }
        
        findPathSum(root->left, targetSum, currSum);
        findPathSum(root->right, targetSum, currSum);
        
    }
public:
    int count = 0;
    int pathSum(TreeNode* root, int targetSum) {
        if(root == nullptr)
            return 0;
        long currSum = 0;
        findPathSum(root, targetSum, currSum);
        pathSum(root->left, targetSum);
        pathSum(root->right, targetSum);
        return count;
    }
};