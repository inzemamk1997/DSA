class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // 2 5 6 10
        // 0 1 2 3
        int n = nums.length;
        int count = 0;
        // nums[i] < k => count += i + 1
        // nums[i] * nums[j] < k => += j - i
        
        for(int i = 0; i < n; i++){
            long mul = 1;
            for(int j = i; j < n; j++){
                mul *= nums[j];
                if(mul < k) count++;
                else break;
            }
        }
        return count; 
    }
}