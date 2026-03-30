package basic.TripillarAssignment.Module16;
import java.util.*;

    public class Neighbors {

        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < 3; i++)
                graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(0).add(2);

            System.out.println("Neighbors of 0: " + graph.get(0));
        }
    }

