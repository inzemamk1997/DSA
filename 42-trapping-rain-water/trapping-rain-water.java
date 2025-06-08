class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // [4,2,0,3,2,5]
        //  0,4,4,4,4,4
        //  5,5,5,5,5,0
      //    0,2,4,1,2,0
        // min(leftMax, rightMax) - height[i];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i-1], leftMax[i-1]);
            rightMax[n-i-1] = Math.max(height[n-i], rightMax[n-i]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int waterCapacity = Math.min(leftMax[i], rightMax[i])*1;
            if(waterCapacity > height[i])
                ans += waterCapacity - height[i];
        }
        return ans;
        
    }
}