class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (Integer.compare(b[0], a[0]))
        );
        for(int i = 0; i < boxTypes.length; i++){
            pq.add(new int[]{boxTypes[i][1], boxTypes[i][0]});
        }
        while(truckSize > 0 && !pq.isEmpty()){
            int[] l = pq.poll();
            ans += Math.min(l[1], truckSize) * l[0];
            truckSize -= l[1];
        }
        return ans;
    }
}