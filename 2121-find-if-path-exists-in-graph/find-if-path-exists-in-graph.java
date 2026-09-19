class Solution {
    public class edge{
        int s;
        int d;
        public edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }
        // 0 => 1 , 2
        // 1 => 0, 2
        // 2 => 0, 1
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(source);
        boolean[] visited = new boolean[n];
        while(!dq.isEmpty()){
            int node = dq.pollFirst();
            if(node == destination) return true;
            if(!visited[node]){
                for(Integer neighbor : adjList.get(node)){
                    if(!visited[neighbor]){
                        dq.add(neighbor);
                    }
                }
            }
            visited[node] = true;
        }
        return false;
    }
}