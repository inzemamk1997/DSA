class Solution {
    record Pair(Integer first, Integer second){

    }
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int min_product = 1;
        int max_product = 1;
        
        for (int i = 0; i < n; i++){

            int tmp = max_product;
            max_product = Math.max( max_product * nums[i], Math.max(min_product * nums[i], nums[i]));
            min_product = Math.min( min_product * nums[i], Math.min(nums[i], tmp * nums[i]));
            res = Math.max(res, Math.max(max_product, min_product));
        }
        return res;
    }
}