class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, n = nums.length, ans = 0;
        for(int h = 0; h < n; h++){
            if(nums[h] == 0) k--;
            while(k < 0 && l <= h){
                if(nums[l] == 0) k++;
                l++;
            }
            ans = Math.max(ans, h - l + 1);
        }
        return ans;
    }
}