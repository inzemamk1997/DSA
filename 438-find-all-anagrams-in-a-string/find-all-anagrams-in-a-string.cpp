class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> mp(26, 0);
        for(char ch : p)
            mp[ch - 'a']++;
        
        int n1 = s.size(), n2 = p.size();
        vector<int> ans;
        vector<int> window(26, 0);

        for(int i = 0; i < n1; i++){
            if(i < n2){
                window[s[i] - 'a']++;
            }else{
                window[s[i] - 'a']++;
                window[s[i-n2] - 'a']--;
            }

            if(mp == window)
                ans.push_back(abs(n2-i-1));
        }
        return ans;
    }
};