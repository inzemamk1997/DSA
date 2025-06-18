class Solution {
    int[] dp;
    int lis(int i, int[] nums){
        if(dp[i] != -1) return dp[i];
        int ans = 1;
        for(int j = 0; j < i; j++){
            if(nums[i] > nums[j])
                ans = Math.max(ans, lis(j, nums) + 1);
        }
        return dp[i] = ans;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, - 1);
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, lis(i, nums));
        }
        return ans;
    }
}