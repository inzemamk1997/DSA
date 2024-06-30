class Solution {
public:
    const static bool cmp(const pair<int, int> &a, const pair<int, int> &b){
        return a.second>b.second;
    }
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        vector<int> res;
        for(int val: nums)
            mp[val]++;
        vector<pair<int, int> > p(mp.begin(), mp.end());
        sort(p.begin(), p.end(), cmp);
        for(int i=0; i<k; i++)
            res.push_back(p[i].first);
        return res;
    }
};