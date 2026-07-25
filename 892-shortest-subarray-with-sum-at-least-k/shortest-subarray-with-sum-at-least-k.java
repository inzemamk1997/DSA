class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> dq = new ArrayDeque<>();
        long[] prefixSum = new long[n + 1];
        for(int i = 0; i < n; i++){
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int result = n + 1;
        
        for(int i = 0; i <= n; i++){
        
            while(!dq.isEmpty() && prefixSum[i] - prefixSum[dq.peekFirst()] >= k){
                result = Math.min(result, i - dq.pollFirst());
            }
            
            while(!dq.isEmpty() && prefixSum[i] <= prefixSum[dq.peekLast()]){
                dq.pollLast();
            }

            dq.addLast(i);
        }
        return result == n + 1 ? -1 : result;
    }
}