class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(-1);
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            while(dq.peekLast() != -1 && heights[i] < heights[dq.peekLast()]){
                int l = dq.pollLast();
                maxArea = Math.max((i - dq.peekLast() - 1)*heights[l], maxArea);
            }
            dq.add(i);
        }
        while(dq.peekLast() != -1){
            int l = dq.pollLast();
            maxArea = Math.max((n - dq.peekLast() - 1)*heights[l], maxArea);
        }
        return maxArea;
    }
}