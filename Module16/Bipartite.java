package basic.TripillarAssignment.Module16;
    import java.util.*;

    public class Bipartite {

        boolean isBipartite(ArrayList<ArrayList<Integer>> graph) {
            int[] color = new int[graph.size()];
            Arrays.fill(color, -1);

            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            color[0] = 0;

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int adj : graph.get(node)) {
                    if (color[adj] == -1) {
                        color[adj] = 1 - color[node];
                        q.add(adj);
                    } else if (color[adj] == color[node]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int V = 3;
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(1).add(2);

            System.out.println(new Bipartite().isBipartite(graph));
        }
    }

