class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        int n = rooms.size();
        vector<vector<int> > adj(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<rooms[i].size(); j++){
                adj[i].push_back(rooms[i][j]);
            }
        }

        vector<bool> visited(n, false);

        queue<int> q;
        q.push(0);

        while(!q.empty()){
            int room = q.front();
            q.pop();
            if(!visited[room]){
                visited[room] = true;
                for(int j : rooms[room])
                    q.push(j);
            }
        }

        for(bool v : visited)
            if(!v)
                return false;
        
        return true;
    }
};