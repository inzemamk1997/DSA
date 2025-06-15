class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int[][] pyramid = new int[n][n];
        for(int i = 0; i < n; i++){
            pyramid[0][i] = nums[i];
        }
        for(int i = 1 ; i < n; i++){
           for(int j = i; j < n ; j++){
               int el = (pyramid[i-1][j] + pyramid[i-1][j-1])%10;
               pyramid[i][j] = el;
           }
        }
        return pyramid[n-1][n-1];
    }
}