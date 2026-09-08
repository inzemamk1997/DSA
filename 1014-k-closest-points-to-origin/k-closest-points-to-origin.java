class Solution {
    public class Distance{
        public Double d;
        public int[] p;

        public Distance(Double d, int[] p){
            this.d = d;
            this.p = p;
        }
    }
    public Double computeDistance(int[] point){
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Distance> pq = new PriorityQueue<Distance>((a,b) -> Double.compare(a.d,b.d)); 
        for (int[] point : points){
            Double dist = computeDistance(point);
            Distance d = new Distance(dist, point);
            pq.add(d);
        }
        int[][] ans = new int[k][2];
        for(int i =0; i<k; i++){
            Distance d = pq.poll();
            ans[i] = d.p;
        }
        return ans;
    }
}