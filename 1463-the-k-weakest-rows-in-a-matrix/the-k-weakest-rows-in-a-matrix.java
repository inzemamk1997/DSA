class Solution {
    public class NumberOfSoldierAndRow{
        int number;
        int row;

        public NumberOfSoldierAndRow(int number, int row){
            this.number = number;
            this.row = row;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int m = mat.length;
        int n = mat[0].length;
        PriorityQueue<NumberOfSoldierAndRow> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.number == b.number){
                    return Integer.compare(a.row,b.row);
                }
                return Integer.compare(a.number,b.number);
            }
        );

        for(int i = 0; i < m; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                count += mat[i][j];
            }
            pq.offer(new NumberOfSoldierAndRow(count, i));
        }

        for(int i = 0; i < k; i++){
            ans[i] = pq.poll().row;
        }
        return ans;
    }
}