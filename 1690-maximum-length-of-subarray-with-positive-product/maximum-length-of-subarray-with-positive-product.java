class Solution {
    public int getMaxLen(int[] nums) {
        int n = nums.length;
        int neg = 0, fNeg = -1, pZero = -1, ans = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                neg++;
                if(fNeg == -1)
                    fNeg = i;
            }
            if(nums[i] == 0){pZero = i; neg = 0; fNeg = -1;};

            if(neg % 2 != 0){
                ans = Math.max(ans, i - fNeg);
            }else{
                ans = Math.max(ans, i - pZero);
            }
        }
        return ans;
    }
}