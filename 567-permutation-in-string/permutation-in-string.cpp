class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        vector<int> mp(26, 0);
        for(char ch : s1)
            mp[ch - 'a']++;
        
        int n1 = s1.size(), n2 = s2.size();
        vector<int> window(26, 0);
        for(int i = 0; i < n2; i++){
            if(i < n1)
                window[s2[i] - 'a']++;
            else{
                window[s2[i] - 'a']++;
                window[s2[i-n1] - 'a']--;
            }

            if(mp == window)
                return true;
        }
        return false;
    }
};