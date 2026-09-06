class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        // 1 2 3 4 5
        PriorityQueue<Integer> pq = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toCollection(() -> new PriorityQueue<>(Collections.reverseOrder())));
        for(int i = 0; i < k-1; i++)
            pq.poll();
        return pq.peek();
    }
}