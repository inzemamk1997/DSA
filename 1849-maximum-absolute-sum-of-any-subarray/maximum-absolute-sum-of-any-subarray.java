class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int res = Math.max(maxSum, Math.abs(minSum));
        
        for(int i = 1; i < nums.length; i++){
            //System.out.println(maxSum + " " + minSum + " " + res);
            maxSum = Math.max(maxSum + nums[i], nums[i]);

            minSum = Math.min(minSum + nums[i], nums[i]);

            res = Math.max(res, Math.max(maxSum, Math.abs(minSum)));


        }
        return res;
    }
}