class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // 1 2 3 4 3
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for(int i = 0; i < 2 * n; i++){
            while(!dq.isEmpty() && nums[i % n] > nums[dq.peekLast()]){
                int topIdx = dq.pollLast();
                ans[topIdx] = nums[i % n];
            }
            if(i < n)
                dq.addLast(i % n);    
        }
        return ans;
    }
}