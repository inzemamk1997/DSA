class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int m = grid.size(), n = grid[0].size();
        vector<bool> vis(m * n + 1, false);
        vector<int> ans;
        vis[0] = true;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(vis[grid[i][j]]){
                    ans.push_back(grid[i][j]);
                }
                vis[grid[i][j]] = true;
            }
        }

        for(int i = 0; i < m * n + 1; i++){         
            if(!vis[i])
                ans.push_back(i);
        }
        return ans;
    }
};