class Solution {
public:
    vector<pair<int, int> > dir = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
    void bfs(int i, int j, vector<vector<char>>& grid, vector<vector<bool>>& vis){
        int m = grid.size();
        int n = grid[0].size();
        queue<pair<int, int>> q;
        q.push({i,j});
        while(!q.empty()){
            int x = q.front().first;
            int y = q.front().second;
            q.pop();     
            if (!vis[x][y]){
                vis[x][y] = true;
                for(pair<int, int> d : dir){
                    int dx = d.first;
                    int dy = d.second;
                    if(x + dx >= 0 && x + dx < m && y + dy >= 0 && y + dy < n && !vis[x + dx][y + dy] && grid[x + dx][y + dy] == '1'){
                        q.push({x + dx, y + dy});
                    }
                }
            }
            
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int count = 0;
        vector<vector<bool> > vis(m, vector<bool>(n,false));
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    bfs(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }
};