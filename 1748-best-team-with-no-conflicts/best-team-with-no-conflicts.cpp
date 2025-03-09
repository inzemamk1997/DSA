class Solution {
public:
    int bestTeamScore(vector<int>& scores, vector<int>& ages) {
        // {1,5}, {1,5}, {2, 4}, {2,6}
        int n = ages.size();
        vector<pair<int, int> > mp;
        for(int i=0; i<n; i++)
            mp.push_back({scores[i], ages[i]});
        
        sort(mp.begin(), mp.end());
        sort(scores.begin(), scores.end());
        vector<int> dp(scores.begin(), scores.end());
        for(int i = 0; i < n; i++){
            int maxScore = mp[i].first;
            int maxAge = mp[i].second;
            for(int j = 0; j < i ; j++){
                if(mp[j].second <= maxAge){
                    dp[i] = max(dp[i], dp[j] + maxScore);
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < dp.size(); i++)
            ans = max(ans, dp[i]);
        return ans;
    }
};