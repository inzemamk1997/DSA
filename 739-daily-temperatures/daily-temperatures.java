class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    
        // 73 74 75 71 69 72 76 73
        int n = temperatures.length;
        int[] ans = new int[n];

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && temperatures[i] > temperatures[dq.peekLast()]){
                int idx = dq.pollLast();
                ans[idx] = i - idx;
            }
            dq.add(i);
        }
        return ans;
    }
}