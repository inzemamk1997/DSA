class Solution {
public:
    // Depth First Search function to visit rooms
    void dfs(int i, vector<vector<int>>& rooms, vector<bool> &cont) {
        cont[i] = true; // Mark room i as visited
        for(auto j : rooms[i]) { // Explore all keys in room i
            if(!cont[j]) dfs(j, rooms, cont); // Visit the room corresponding to the key if not already visited
        }
    }
    
    // Function to check if all rooms can be visited
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        int n = rooms.size();
        vector<bool> cont(n, false); // Create a visited array to track visited rooms
        cont[0] = true; // Mark room 0 as initially visited
        dfs(0, rooms, cont); // Start DFS from room 0
        for(auto j : cont) { // Check if all rooms have been visited
            if(!j) return false; // If any room is not visited, return false
        }
        return true; // If all rooms are visited, return true
    }
};