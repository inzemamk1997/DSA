class Solution {
public:
    int lengthOfLastWord(string s) {
        istringstream iss(s);
        string word;
        vector<string> words;
        while(iss >> word)
            words.push_back(word);
        int n = words.size();
        if(n < 1)
            return 0;
        return (words[n-1]).size();
    }
};