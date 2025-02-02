class Solution {
public:
    vector<pair<int, int>> dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int orangesRotting(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int minMinute = 0, c = 0;
        queue<pair<int, int>> q; 
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    q.push({i,j});
                }else if(grid[i][j] == 1)
                    c++;
            }
        }
        while(!q.empty() && c != 0){
            int sz = q.size();
            while(sz--){
                int x = q.front().first;
                int y = q.front().second;
                q.pop();
                for (pair<int, int> d : dir){
                    int new_x = x + d.first;
                    int new_y = y + d.second; 
                    if(new_x >= 0 && new_x < m && new_y >= 0 && new_y < n && grid[new_x][new_y] == 1){
                        c--;
                        grid[new_x][new_y] = 2;
                        q.push({new_x, new_y});
                    }
                }
            }
            minMinute++;
        }
        if(c==0)
            return minMinute;
        else
            return -1;
    }
};