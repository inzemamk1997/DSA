class Solution {
    
    void helper(int[][] graph, int source, int destination, List<List<Integer>> allPaths, List<Integer> paths){
        paths.add(source);
        if(source == destination){
            allPaths.add(new ArrayList<>(paths));
        }else{
            for(int neighbor: graph[source]){
                    helper(graph, neighbor, destination, allPaths, paths);
            }
        }
      paths.removeLast();
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int source = 0;
        int destination = graph.length - 1;
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> paths = new ArrayList<>();
        helper(graph, source, destination, allPaths, paths);
        return allPaths;

    }
}