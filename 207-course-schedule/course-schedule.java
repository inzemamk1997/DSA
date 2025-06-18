class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            inDegree[v]++;
            adj.get(u).add(v);
        }
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[numCourses];

        for(int node = 0; node < numCourses; node++){
            if(inDegree[node] == 0){
                dq.add(node);
                visited[node] = true;
            }
        }
        while(!dq.isEmpty()){
            int node = dq.poll();
            for(int neighbour : adj.get(node)){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0 && !visited[neighbour]){
                    dq.add(neighbour);
                    visited[neighbour] = true;
                } 
            }
        }
        for(int node = 0; node < numCourses; node++){
            if(inDegree[node] != 0 )
                return false;
        }
        return true;
    }
}