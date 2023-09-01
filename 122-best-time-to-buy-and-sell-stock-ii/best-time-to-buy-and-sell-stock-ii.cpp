class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int current = 0;
        int ans = 0;
        for(int i=1; i<prices.size(); i++){
            if(prices[i] > prices[current])
                ans += prices[i] - prices[current];
            current = i;
        }
        return ans;
    }
};