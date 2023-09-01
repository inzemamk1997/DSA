class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        if(nums.size() == 1)
            return 0;
        vector<int> dp(n, 0);
        int i = 0;
        while(i<n){
            if(nums[i] != 0){
                int k = nums[i]; 
                if(i+k>=n-1)
                    return dp[i]+1;
                for(int l=i+1; l<=i+k; l++){
                    dp[l] = (dp[l]==0) ? dp[i]+1 : min(dp[i]+1, dp[l]);
                }
            }
            i++;
        }
        return dp[n-1];
    }
};