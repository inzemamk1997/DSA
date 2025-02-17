class Solution {
public:
    string minWindow(string s, string t) {
        int m = s.size();
        int n = t.size();
        if( n > m)
            return "";
        unordered_map<char, int> mp, currMp;
        for(char ch : t)
            mp[ch]++;
        
        int start = 0;
        int i = 0;
        int res = INT_MAX, resStart = -1;
        string sub = "";
        int have = 0, need = mp.size();
        while(i < m){
            if(mp.find(s[i]) != mp.end()){
                currMp[s[i]]++;
                if(currMp[s[i]] == mp[s[i]])
                    have++;
                while(have == need){
                    if(res > i - start + 1){
                        res = i - start + 1;
                        resStart = start;
                    }
                    if(mp.find(s[start]) != mp.end()){
                        currMp[s[start]]--;
                        if(currMp[s[start]] < mp[s[start]])
                            have--;
                    }
                    start++;
                }
            }
            i++;
        }
        return resStart == -1 ? "" : s.substr(resStart, res);
    }
};