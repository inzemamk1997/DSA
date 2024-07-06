class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int s = 0, n = nums.size(), sum = INT_MIN, currSum = 0;
        while(s<n){
            currSum += nums[s];
            sum = max(sum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
            s++;
        }
        return sum;
    }
};