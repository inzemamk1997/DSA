class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0, j = 0, n = nums.length, maxSubarraySum = Integer.MIN_VALUE, currSubArraySum = 0;
        while(j < n){
            currSubArraySum += nums[j];
            maxSubarraySum = Math.max(currSubArraySum, maxSubarraySum);

            while(currSubArraySum < 0 && i <= j){
                currSubArraySum -= nums[i];
                i++;
            }
            j++;
        }
        return maxSubarraySum;
    }
}