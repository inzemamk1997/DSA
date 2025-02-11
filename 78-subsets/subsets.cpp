class Solution {
private:
    void solve(vector<int>& nums, int pos, vector<vector<int>> &ans, vector<int>& temp){
        if(pos >= nums.size()){
            ans.push_back(temp);
            return;
        }
        temp.push_back(nums[pos]);
        solve(nums, pos + 1, ans, temp);
        temp.pop_back();
        solve(nums, pos + 1, ans, temp);
    }
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        int pos = 0;
        vector<vector<int>> ans;
        vector<int> temp;
        solve(nums, pos, ans, temp);
        return ans;
    }
};