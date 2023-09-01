class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        // Modifying existing array to store the maximum index that it can reach from curr_position
        for(int i = 1; i<n; i++){
            nums[i] = max(nums[i-1], nums[i]+i);
        }
        int ans = 0;
        int index = 0;
        while(index < n-1){
            index = nums[index];
            ans++;
        }
        return ans;
    }
};