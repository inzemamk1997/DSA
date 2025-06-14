class Solution {
    public int orangesRotting(int[][] grid) {
        // 0 => Empty, 1 => Fresh, 2 => Rotten
        int m = grid.length;
        int n = grid[0].length, e = 0;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        int rotten = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                    rotten++;
                }
                if(grid[i][j] == 0) e++;
            }
        }
        int total_rotten = m * n - e;
        boolean[][] visited = new boolean[m][n];
        
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        int minutes = 0;
        if(rotten == total_rotten) return 0;
        while(!q.isEmpty() && rotten < total_rotten){
            int size = q.size();
            for(int k = 0; k < size; k++){
                int[] d = q.poll();
                int x = d[0], y = d[1];
                visited[x][y] = true;
                for(int i = 0; i < dir.length; i++){
                    int new_x = d[0] + dir[i][0];
                    int new_y = d[1] + dir[i][1];
                    if(new_x >= 0 && new_x < m && new_y >= 0 && new_y < n && !visited[new_x][new_y]){
                        if(grid[new_x][new_y] == 1){
                            q.add(new int[]{new_x, new_y});
                            grid[new_x][new_y] = 2;
                            rotten++;
                        }
                    }
                }
            }
            minutes++;  
            if(rotten == total_rotten) return minutes;         
        }
        return -1;
    }
}