class Solution {
    public int maximumSum(int[] a) {
        int n = a.length;

        int noDeleteSum = a[0];
        int oneDeleteSum = 0;
        int res = a[0];

        for(int i = 1; i < n; i++){
            int prevNoDeleteSum = noDeleteSum;
            int prevOneDeleteSum = oneDeleteSum;

            noDeleteSum = Math.max(prevNoDeleteSum + a[i], 
                                   a[i]);
            
        
            oneDeleteSum = Math.max(prevNoDeleteSum,prevOneDeleteSum + a[i]);
            

            res = Math.max(res, Math.max(oneDeleteSum, noDeleteSum));
        }
        return res;
    }
}