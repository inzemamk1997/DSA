class Solution {
public:

    // Encodes a URL to a shortened URL.
    unordered_map<string, string> mp;
    int n = 0;
    string encode(string longUrl) {
        string res = "http://tinyurl.com/" + to_string(n);
        mp[res] = longUrl;
        n++;
        return res;
    }

    // Decodes a shortened URL to its original URL.
    string decode(string shortUrl) {
        return mp[shortUrl];
    }
};

// Your Solution object will be instantiated and called as such:
// Solution solution;
// solution.decode(solution.encode(url));