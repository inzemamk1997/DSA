class Solution {
public:
    
    vector<string> topKFrequent(vector<string>& words, int k) {
        unordered_map<string, int> mp;
        for(string s: words)
            mp[s] += 1;
        vector<string> ans;
        auto cmp = [](const pair<int, string> &a, const pair<int, string> &b){
            if(a.first == b.first)
                return a.second > b.second;
            return a.first < b.first;
        };
        priority_queue<pair<int, string>, vector<pair<int, string>>, decltype(cmp)> pq(cmp);
        for(auto t : mp){
            pq.push({t.second, t.first});
        }
        while(k--){
            ans.push_back(pq.top().second);
            pq.pop();
        }
        return ans;
    }
};