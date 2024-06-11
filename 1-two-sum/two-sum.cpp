class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // 0 to n
        // 0 to n
        vector<int> ans;
        map<int, int> mp;
        int n = nums.size();
        for(int i = 0; i<n; i++){
            mp[nums[i]] = i;
        }
        for(int i=0; i<n; i++){
            int k = target - nums[i];
            if(mp.find(k) != mp.end() && i != mp[k]){
                ans.push_back(i);
                ans.push_back(mp[k]);
                return ans;
            }

        }
        return ans;
    }
};