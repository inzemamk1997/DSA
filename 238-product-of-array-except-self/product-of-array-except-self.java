class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        // 1 1 2 6
        prefix[0] = 1;
        for (int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        
        int[] suffix = new int[n];
        // 24 12 4 1
        suffix[n-1] = 1;
        for (int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        
        for (int i=0; i<n; i++)
            suffix[i] = suffix[i] * prefix[i];
        
        return suffix;
    }
}