package basic.TripillarAssignment.Module16;
import java.util.*;

    public class ShortestPath {

        void shortestPath(ArrayList<ArrayList<Integer>> graph, int src) {
            int[] dist = new int[graph.size()];
            Arrays.fill(dist, -1);

            Queue<Integer> q = new LinkedList<>();
            q.add(src);
            dist[src] = 0;

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int adj : graph.get(node)) {
                    if (dist[adj] == -1) {
                        dist[adj] = dist[node] + 1;
                        q.add(adj);
                    }
                }
            }

            System.out.println(Arrays.toString(dist));
        }

        public static void main(String[] args) {
            int V = 4;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(1).add(2);
            graph.get(2).add(3);

            new ShortestPath().shortestPath(graph, 0);
        }
    }

