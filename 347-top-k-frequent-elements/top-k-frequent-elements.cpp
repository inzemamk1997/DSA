class Solution {
public:
    
    vector<int> topKFrequent(vector<int>& nums, int k) {
        auto Compare = [](const pair<int, int> &a, const pair<int, int> &b){
            return a.first < b.first;
        };
        priority_queue<pair<int, int>, vector<pair<int, int>> , decltype(Compare)> pq(Compare);
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