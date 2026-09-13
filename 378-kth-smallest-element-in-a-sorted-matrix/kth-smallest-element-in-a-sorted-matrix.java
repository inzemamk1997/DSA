class Solution {
    public class MatrixCoordinate{
        int val;
        int rowIndex;
        int colIndex;

        public MatrixCoordinate(int rowIndex, int colIndex, int val){
            this.rowIndex = rowIndex;
            this.colIndex = colIndex;
            this.val = val;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<MatrixCoordinate> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val,b.val));

        for(int i = 0; i < n; i++)
            pq.add(new MatrixCoordinate(i,0,matrix[i][0]));
        
        for(int i = 0; i < k-1; i++){
            MatrixCoordinate t = pq.poll();
            if(t.colIndex < n - 1)
                pq.add(new MatrixCoordinate(t.rowIndex,t.colIndex+1,matrix[t.rowIndex][t.colIndex+1]));
        }
        return pq.peek().val;
    }
}