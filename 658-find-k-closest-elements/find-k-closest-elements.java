class Solution {
    public class DistAndVal{
        Integer dist;
        Integer val;
        public DistAndVal(Integer dist, Integer val){
            this.dist = dist;
            this.val = val;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<DistAndVal> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.dist.equals(b.dist))
                    return Integer.compare(a.val, b.val);
                return Integer.compare(a.dist, b.dist);
            }
        );

        for (int num : arr){
            int dist = Math.abs(x - num);
            pq.offer(new DistAndVal(dist, num));
        }

        for(int i = 0; i < k; i++){
            // DistAndVal t = pq.poll()
            ans.add(pq.poll().val);
        }
        ans.sort((a, b) -> Integer.compare(a, b));
        return ans;
    }
}