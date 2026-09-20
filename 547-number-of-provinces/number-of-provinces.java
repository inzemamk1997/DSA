class Solution {
    public int findCircleNum(int[][] isConnected) {
        int totalNumberOfProvinces = 0;
        int n = isConnected.length;

        Deque<Integer> dq = new ArrayDeque<>();

        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                totalNumberOfProvinces++;
                dq.add(i);
                while(!dq.isEmpty()){
                    int node = dq.pollFirst();
                    visited[node] = true;

                    for(int j = 0; j < n; j++){
                        if(isConnected[node][j] == 1 && !visited[j])
                            dq.add(j);
                    }
                }
            }
        }

        return totalNumberOfProvinces;
    }
}