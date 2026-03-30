package basic.TripillarAssignment.Module16;
import java.util.*;

    public class TraverseGraph {

        void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {
            visited[node] = true;
            System.out.print(node + " ");

            for (int adj : graph.get(node)) {
                if (!visited[adj])
                    dfs(graph, adj, visited);
            }
        }

        public static void main(String[] args) {
            int V = 4;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(1).add(2);
            graph.get(2).add(3);

            TraverseGraph obj = new TraverseGraph();
            boolean[] visited = new boolean[V];

            obj.dfs(graph, 0, visited);
        }
    }

