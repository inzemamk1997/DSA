class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int left_min = prices[0];
        int profit = 0;
        for(int i=1; i<len; i++){
            if(prices[i] > left_min){
                profit = Math.max(profit, prices[i] - left_min);
            }else{
                left_min = prices[i];
            }
        }
        return profit;
    }
}