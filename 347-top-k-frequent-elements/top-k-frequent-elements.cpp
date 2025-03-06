class Solution {
public:
    
    vector<int> topKFrequent(vector<int>& nums, int k) {
        priority_queue<pair<int, int>> pq;
        unordered_map<int, int> mp;
        for(int num : nums)
            mp[num]++;
        
        for(auto it : mp){
            pq.push({it.second, it.first});
        }

        vector<int> ans;
        while(k--){
            ans.push_back(pq.top().second);
            pq.pop();
        }
        return ans;
    }
};