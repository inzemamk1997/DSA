class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> mp(26, 0);
        for(char ch : p)
            mp[ch - 'a']++;
        
        int n1 = s.size(), n2 = p.size();
        vector<int> ans;
        for(int i = 0; i <= n1-n2; i++){
            int j = i;
            vector<int> anaFreq(26, 0);
            if(mp[s[j] - 'a'] == 0)
                continue;
            while(j-i < n2){
                if(mp[s[j] - 'a'] == 0)
                    break;
                anaFreq[s[j] - 'a']++;
                j++;
            }
            if(mp == anaFreq)
                ans.push_back(i);
        }
        return ans;
    }
};