class Solution {
    
    public int numIslands(char[][] grid) {
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int m = grid.length;
        int n = grid[0].length;

        //boolean[][] visited = new boolean[m][n];

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int island = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    island++;
                    queue.addLast(new int[]{i,j});
                    grid[i][j] = '0';
                    while(!queue.isEmpty()){
                        int[] pos = queue.pollFirst();
                        for(int[] dir : directions){
                            int new_x = pos[0] + dir[0]; 
                            int new_y = pos[1] + dir[1]; 
                            if(!(new_x < 0 || new_x >=m || new_y < 0 || new_y >= n) && grid[new_x][new_y] == '1'){
                                queue.addLast(new int[]{new_x, new_y});
                                grid[new_x][new_y] = '0';
                            }
                        }
                    }
                }
            }
        }
        return island;
    }
}