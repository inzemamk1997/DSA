class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        int res = INT_MIN;
        int i = 0, sum = 0;
        while( i < n){
            sum += nums[i];
            
            res = max(res, sum);
            
            if(sum < 0)
                sum = 0;
            i++;
        }
        return res;
    }
};