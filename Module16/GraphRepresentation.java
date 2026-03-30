package basic.TripillarAssignment.Module16;
import java.util.*;

    public class GraphRepresentation {

        public static void main(String[] args) {
            int V = 5;

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < V; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(0).add(2);
            graph.get(1).add(3);

            System.out.println(graph);
        }
    }


