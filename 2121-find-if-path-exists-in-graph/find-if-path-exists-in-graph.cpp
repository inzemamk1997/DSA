class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        unordered_map<int, vector<int> > adj;
        for(int i=0; i<edges.size(); i++){
            adj[edges[i][0]].push_back(edges[i][1]);
            adj[edges[i][1]].push_back(edges[i][0]);
        }
        vector<int> visited(n, false);
        queue<int> q;
        q.push(source);
        while(!q.empty()){
            int node = q.front();
            q.pop();
            if(node == destination)
                return true;
            if(!visited[node]){
                visited[node] = true;
                for(int t : adj[node]){
                    q.push(t);
                }
            }
        }
        return false;
    }
};