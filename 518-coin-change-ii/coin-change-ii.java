class Solution {
    private int[][] dp;
    private int solve(int ind, int amount, int[] coins){
        if(amount == 0) return 1;
        
        if(ind < 0) return 0;  
        if(dp[ind][amount] != -1)
            return dp[ind][amount];    
        int ways = 0;
        for(int coin_amount = 0; coin_amount <= amount; coin_amount += coins[ind]){
            ways += solve(ind - 1, amount - coin_amount, coins);
        }
        return dp[ind][amount] = ways;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[n][amount+1];
        for(int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return solve(n-1, amount, coins);
    }
}