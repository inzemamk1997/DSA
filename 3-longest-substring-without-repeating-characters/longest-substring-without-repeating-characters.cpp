class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        int i = 0;
        unordered_map<char, int> mp;
        int start = 0;
        int ans = 0;
        while(i < n){
            if(mp.find(s[i]) != mp.end()){
                start = mp[s[i]] + 1;
                mp.clear();
                i = start;
            }else{
                mp[s[i]] = i;
                ans = max(ans, i - start + 1);
                i++;
            }
        }
        return ans;
    }
};