class Solution {
public:
    
    int solve(int n, vector<int> &perfectSquares, int i, vector<vector<int>> &dp){
        if(n <= 0)
            return 0;
        if (i < 0) return n+1;
        if(dp[n][i] != -1)
            return dp[n][i];
        if(n == 1)
            return 1;
        int least_number = n+1;
        if(perfectSquares[i] <= n)
            least_number = 1 + solve(n - perfectSquares[i], perfectSquares, i, dp);
        
        return dp[n][i] = min(least_number, solve(n, perfectSquares, i-1, dp));
    }
    int numSquares(int n) {
        vector<int> perfectSquares;
        
        for(int i = 1; i*i <= n; i++)
            perfectSquares.push_back(i*i);
        int last = perfectSquares.size() - 1;
        vector<vector<int>> dp(n + 1, vector<int>(last + 1, -1));
        return solve(n, perfectSquares, last, dp);
    }
};