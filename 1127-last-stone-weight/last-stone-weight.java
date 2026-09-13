class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        Arrays.stream(stones).boxed().forEach((stone) -> pq.offer(stone));

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();

            int remainingWeight = Math.abs(x-y);
            pq.offer(remainingWeight);
        }

        return pq.peek();
    }
}