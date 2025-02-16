class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int start = 0;
        int ans = 0;
        unordered_map<char, int> mp;
        for(int i = 0; i < n; i++){
            if(mp.find(s[i]) != mp.end() && mp[s[i]] >= start){
                start = mp[s[i]] + 1;
            }
            mp[s[i]] = i;
            ans = max(ans, i - start + 1);
        }
        return ans;
    }
};