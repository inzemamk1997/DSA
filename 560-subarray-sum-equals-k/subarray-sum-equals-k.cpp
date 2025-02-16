class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        mp[0] = 1;
        int sum = 0, n = nums.size();
        // 0 1 2
        // 1 1 1
        // 1:0 2:1 3:2
        int c = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            int y = sum - k;
            if(mp.find(y) != mp.end()){
                c += mp[y];
            }
            mp[sum] += 1;
            // x + y = k
            
        }
        return c;
    }
};