class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        unordered_map<char, int> mp;
        for(char ch : p)
            mp[ch]++;
        
        int n1 = s.size(), n2 = p.size();
        vector<int> ans;
        for(int i = 0; i <= n1-n2; i++){
            int j = i;
            unordered_map<char, int> anaFreq;
            while(j-i < n2){
                anaFreq[s[j]]++;
                j++;
            }
            if(mp == anaFreq)
                ans.push_back(i);
        }
        return ans;
    }
};