class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        //maxSum Kadane
        int maxSum = nums[0];
        int res1 = nums[0]; 

        int minSum = nums[0];
        int res2 = nums[0]; 
        int totalSum = nums[0];
        for(int i = 1; i < n; i++){
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            res1 = Math.max(res1, maxSum);

            minSum = Math.min(minSum + nums[i], nums[i]);
            res2 = Math.min(res2, minSum);

            totalSum += nums[i];
        }

        return totalSum == res2 ? res1 : Math.max(res1, totalSum - res2);
    }
}