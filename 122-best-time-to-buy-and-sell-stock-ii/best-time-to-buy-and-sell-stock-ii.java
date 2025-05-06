class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        int i=1;
        while( i<n ){
            if(prices[i] > buy){
                int sell = prices[i];
                while(i < n && prices[i] >= sell){
                    //System.out.println(sell);
                    sell = prices[i];
                    //System.out.println(sell);
                    i++;
                }
                //System.out.println(buy + " " + sell);
                // System.out.println(sell);
                profit += sell - buy;
                if(i < n)
                    buy = prices[i];
            }else{
                buy = prices[i];
            }
            i++;
        }
        return profit;
    }
}