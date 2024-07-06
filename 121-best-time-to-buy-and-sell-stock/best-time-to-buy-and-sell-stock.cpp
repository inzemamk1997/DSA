class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0, n = prices.size(), i = 1, minLeft = prices[0];
        while(i < n){
            int currProfit = prices[i] - minLeft;
            profit = max(profit, currProfit);
            minLeft = min(minLeft, prices[i]);
            i++;
        }
        return profit;
    }
};