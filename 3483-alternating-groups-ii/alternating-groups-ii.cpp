class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors, int k) {
        int n = colors.size();
        int l = 0, r = 1;
        int res = 0;
        for(int r = 1; r < n + k - 1; r++){
            if (colors[(r-1) % n] == colors[r % n])
                l = r;
            
            if (r - l + 1 > k)
                l++;

            if (r - l + 1 == k)
                res++;
        }
        return res;
    }
};