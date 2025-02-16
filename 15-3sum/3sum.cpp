class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        unordered_map<int, int> mp;
        int n = nums.size();
        for(int i = 0; i < nums.size(); i++)
            mp[nums[i]] = i;
        sort(nums.begin(), nums.end());
        for(int i=0; i<n; i++){
            // while(i < n-2 && nums[i] == nums[i+1]) i++;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1, k = nums.size() - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                
                if(sum == 0){
                    ans.push_back({nums[i],nums[j],nums[k]});
                    while(j < k && nums[j] == nums[j+1]) j++;
                    j++;
                    while(k > j && nums[k] == nums[k-1]) k--;
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
                
            }
        }
        return ans;
    }
};