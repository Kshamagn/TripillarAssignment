package basic.TripillarAssignment.Module16;
import java.util.*;

    public class CountGraph {

        public static void main(String[] args) {
            int V = 3;
            int edges = 0;

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(1).add(2);

            for (int i = 0; i < V; i++)
                edges += graph.get(i).size();

            System.out.println("Vertices: " + V);
            System.out.println("Edges: " + edges);
        }
    }

