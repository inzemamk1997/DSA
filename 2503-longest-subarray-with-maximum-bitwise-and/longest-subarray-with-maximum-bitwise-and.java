class Solution {
    public int longestSubarray(int[] nums) {
        int l = nums.length;
        int maxLenSubarray = 0, ans = 0;
        int maxEl = nums[0];
        for(int num: nums)
            maxEl = Math.max(num,maxEl);
        for(int num: nums){
            if(num == maxEl){
                maxLenSubarray++;
            }else{
                maxLenSubarray = 0;
            } 
            ans = Math.max(ans, maxLenSubarray);
        }
        return ans;
    }
}