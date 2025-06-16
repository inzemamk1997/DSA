class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        int n = points.length;
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(b[0],a[0]));
        for(int i = 0; i < n; i++){
            int x = points[i][0];
            int y = points[i][1];
            
            long d = x*x + y*y;
            pq.add(new long[]{d, x, y});
            int sz = pq.size();
            if(sz > k){
                pq.poll();        
            }
        }
        for(int i = 0; i < k; i++){
            long[] x = new long[3];
            x = pq.poll();
            ans[i][0] = (int)x[1];
            ans[i][1] = (int)x[2];
        }
        return ans;
    }
}