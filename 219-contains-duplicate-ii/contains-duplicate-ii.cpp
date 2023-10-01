class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int, vector<int>> mp;
        for(int i=0; i<nums.size(); i++)    
            mp[nums[i]].push_back(i);

        for(auto it : mp){
            vector<int> pos = it.second;
            int mn = INT_MAX;
            if(pos.size() > 1){
                for(int i=0; i<pos.size()-1; i++){
                    mn = min(mn, pos[i+1]-pos[i]);
                    if(mn <= k)
                        return true;
                }
            }
        }
        return false;
    }
};