class Solution {
    public int maxProfit(int[] prices) {
        // 7 1 5 3 6 4
        int n = prices.length;
        int maxRightPrice = prices[n-1];
        int maxProfit = 0;
        for(int i = n - 2; i >= 0; i--){
            int currProfit = maxRightPrice - prices[i];
            maxProfit = Math.max(maxProfit, currProfit);
            maxRightPrice = Math.max(maxRightPrice, prices[i]);
        }
        return maxProfit;
    }
}