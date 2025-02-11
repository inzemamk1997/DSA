class Solution {
public:
    void solve(vector<vector<int>> &ans, vector<int>& nums, int pos){
        if(pos >= nums.size()){
            ans.push_back(nums);
            return;
        }

        for(int i = pos; i < nums.size(); i++){
            swap(nums[i], nums[pos]);
            solve(ans, nums, pos + 1);
            swap(nums[pos], nums[i]);
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        int pos = 0;
        solve(ans, nums, pos);
        return ans;
    }
};