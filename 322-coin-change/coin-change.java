class Solution {
    long[] dp;
    long minCoin(int[] coins, int amount){
        if(dp[amount] != -1)
            return dp[amount];
        if(amount == 0)
            return dp[amount] = 0;
        long ans = Integer.MAX_VALUE;
        for(int coin : coins){
            if(amount - coin >= 0){
                ans = Math.min(ans, minCoin(coins, amount - coin) + 1);
            }
        }
        return dp[amount] = ans;
    }
    public int coinChange(int[] coins, int amount) {
        dp = new long[amount + 1];
        Arrays.fill(dp, -1);
        long ans = minCoin(coins, amount);
        //System.out.println(amount);
        
        if(dp[amount] >= Integer.MAX_VALUE)
            return -1;
        return (int)dp[amount];
    }
}