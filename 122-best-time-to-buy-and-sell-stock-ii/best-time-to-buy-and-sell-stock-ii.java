class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int buy = prices[0];
        
        for(int i=1; i<n; i++){
            
            if(prices[i] > buy){
                while(i < n && prices[i] > prices[i-1]) i++;
                ans += prices[i-1] - buy;
                if(i < n - 1)
                    buy = prices[i]; 
            }else{
                buy = prices[i];
            }
        }
        return ans;
    }
}