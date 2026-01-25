class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE, n = nums.length, j = 0;
        while(j < n){
            currSum += nums[j];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }        
            j++;
        }
        return maxSum;
    }
}