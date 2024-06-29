class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        unordered_map<string, vector<string> > mp;
        for(string &str : strs){
            vector<int> t(26,0);
            for(char ch: str){
                t[ch - 'a']++;
            }
            string key = "";
            for(int i : t){
                key += "#" + to_string(i);
            }
            mp[key].push_back(str);
        }
        for(auto it: mp){
            ans.push_back(it.second);
        }
        return ans;
    }
};