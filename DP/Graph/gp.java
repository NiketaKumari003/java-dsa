public class PracticeGraph {
    public static void main(String[] args) {
        int n = 5;
        int graph[][] = new int[n][n];

        // Initialize adjacency matrix
        graph[0][4] = graph[4][0] = 1;
        graph[0][1] = graph[1][0] = 1;
        graph[1][2] = graph[2][1] = 1;
        graph[1][3] = graph[3][1] = 1;
        graph[1][4] = graph[4][1] = 1;
        graph[2][3] = graph[3][2] = 1;

        // Create adjacency list
        List<List<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Fill adjacency list
        adjList.get(0).add(4);
        adjList.get(0).add(1);
        adjList.get(1).add(2);
        adjList.get(1).add(3);
        adjList.get(1).add(4);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(3).add(2);
        adjList.get(3).add(4);
        adjList.get(4).add(1);
        adjList.get(4).add(0);

        // Perform DFS
        int startNode = 3;
        int[] visited = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (visited[curr] != 1) {
                visited[curr] = 1;
                System.out.println(curr);
                List<Integer> currN = adjList.get(curr);
                for (int i = 0; i < currN.size(); i++) {
                    if (visited[currN.get(i)] != 1) {
                        stack.push(currN.get(i));
                    }
                }
            }
        }
    }
}