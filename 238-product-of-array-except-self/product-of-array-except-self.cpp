class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int>  ans(n);
        int currPrefix = 1, currSuffix = 1;
        for(int i=0; i<n; i++){
            if(i==0)
                currPrefix = 1;
            else
                currPrefix = nums[i-1]*currPrefix;

            ans[i] = currPrefix;
        }

        for(int i=n-1; i>=0; i--){
            if(i==n-1)
                currSuffix = 1;
            else
                currSuffix = nums[i+1]*currSuffix;

            ans[i] = ans[i] * currSuffix;
        }
        
        
        return ans;
    }
};