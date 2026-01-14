class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFreq = 1;

        for (int i = nums.length - 1; i > 0  && maxFreq < i+1; i--){
            int tempK = k ;
            int currFreq = 1;
            for(int j = i - 1; j >= 0; j--){
                int diff = nums[i] - nums[j];
                if( diff <= tempK){
                    tempK -= diff;
                    currFreq++;
                }else{
                    break;
                }
            }
            maxFreq = Math.max(maxFreq, currFreq);
        }
        return maxFreq;
    }
}