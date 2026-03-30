package basic.TripillarAssignment.Module16;
import java.util.*;

    public class CycleDetection {

        boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
            visited[node] = true;

            for (int adj : graph.get(node)) {
                if (!visited[adj]) {
                    if (dfs(adj, node, visited, graph))
                        return true;
                } else if (adj != parent) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int V = 3;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(1).add(0);
            graph.get(1).add(2);
            graph.get(2).add(1);

            CycleDetection obj = new CycleDetection();
            boolean[] visited = new boolean[V];

            System.out.println(obj.dfs(0, -1, visited, graph));
        }
    }

