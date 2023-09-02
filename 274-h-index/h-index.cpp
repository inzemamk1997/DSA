class Solution {
public:
    int hIndex(vector<int>& citations) {
        int n = citations.size();
        sort(citations.begin(), citations.end());
        int ans = INT_MAX;         
        for(int i=0; i<n; i++){
            if(citations[i]>=(n-i))
                return n-i;
        }
        return 0;
    }
};