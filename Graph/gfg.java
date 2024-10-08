
//User function Template for Java


class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u); // For undirected graphs
        }

        return adjacencyList;
    }
}