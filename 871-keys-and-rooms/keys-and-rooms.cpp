class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        int n = rooms.size();
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