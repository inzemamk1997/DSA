class Solution {
public:
    vector<int> partitionLabels(string s) {
        int start = 0;
        int end = 0;
        int n = s.size();
        vector<int> partitions;
        unordered_map<char, int> mp;
        for(int i=0; i<n; i++)
            mp[s[i]] = i;
        
        while(end < n){
            int c = 0;
            while(start <= end){
                end = max(end, mp[s[start]]);
                start++;
                c++;
            }
            end = start;
            partitions.push_back(c);

        }

        if(partitions.size() == 0)
            partitions.push_back(n);
        return partitions;
    }
};