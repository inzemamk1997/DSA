class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long c = 0;
        long ans = 0;
        for(int num : nums){
            if(num == 0){
                c++;
            }else{
                ans += ((long)(c * (c+1)))/2;
                c = 0;
            }
        }   
        ans += ((long)(c * (c+1)))/2;
        return ans;     
    }
}


