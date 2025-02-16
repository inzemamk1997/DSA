class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int ans = INT_MIN;
        int n = nums.size();
        int i = 0, sum = 0;
        while(i < n){
            sum += nums[i];
            ans = max(sum, ans);
            if(sum < 0)
                sum = 0;
            i++;
        }
        return ans;
    }
};