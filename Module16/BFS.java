package basic.TripillarAssignment.Module16;
import java.util.*;

    public class BFS {

        void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
            boolean[] visited = new boolean[graph.size()];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

            while (!q.isEmpty()) {
                int node = q.poll();
                System.out.print(node + " ");

                for (int adj : graph.get(node)) {
                    if (!visited[adj]) {
                        visited[adj] = true;
                        q.add(adj);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int V = 4;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(0).add(2);
            graph.get(1).add(3);

            BFS obj = new BFS();
            obj.bfs(graph, 0);
        }
    }

