class Solution {
public:
    void dfs(unordered_map<int, vector<int>>& adj, int node, vector<bool> &visited){
        for(int i : adj[node]){
            if(!visited[i]){
                visited[i] = true;
                dfs(adj, i, visited);
            }
        }
    }
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        vector<bool> visited(n,false);
        int ans = 0;
        unordered_map<int, vector<int> > adj;
        for(int i=0; i<isConnected.size(); i++){
            for(int j=0; j<isConnected[i].size(); j++){
                if(isConnected[i][j] == 1){
                        adj[i].push_back(j);
                        adj[j].push_back(i);
                }
            }
        }
        for(int i=0; i<n; i++){
            if(!visited[i]){
                ans++;
                dfs(adj, i, visited);
                visited[i] = true;

            }
        }
        return ans;
    }
};