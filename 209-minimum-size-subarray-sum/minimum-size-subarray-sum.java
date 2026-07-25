class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = n + 1;
        int i = 0, j = 0, currSum = 0;
        // [1,2,3,4,5] // 11
        while(j < n){
            currSum += nums[j];     
            while(i <= j && currSum >= target){
                if(currSum >= target){
                    minLen = Math.min(minLen, j - i + 1);
                }
                currSum -= nums[i];
                i++;
            }
            j++;
        }
        return (minLen == n + 1) ? 0 : minLen;
    }
}