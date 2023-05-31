import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nDeterminarea drumurilor minime");

        int V = 5;
        GraphD g1 = new GraphD(V);



        g1.addEdge(0, 1, 50);
        g1.addEdge(0, 2, 30);
        g1.addEdge(0, 3, 100);
        g1.addEdge(0, 4, 10);
        g1.addEdge(2, 1, 5);
        g1.addEdge(2, 3, 50);
        g1.addEdge(3, 1, 20);
        g1.addEdge(4, 3, 10);

        g1.shortestPath(0);
        System.out.println("\n-----------------------------------------------------");
        //recomandat matricea de adiacenta


        System.out.println("\n-----------------------------------------------------");
        System.out.println("Kruscal");
        {
            int V1 = 4;
            List<KruskalsMST.Edge> graphEdges = new ArrayList<KruskalsMST.Edge>(
                    List.of(new KruskalsMST.Edge(0, 1, 10), new KruskalsMST.Edge(0, 2, 6),
                            new KruskalsMST.Edge(0, 3, 5), new KruskalsMST.Edge(1, 3, 15),
                            new KruskalsMST.Edge(2, 3, 4)));


            graphEdges.sort(new Comparator<KruskalsMST.Edge>() {
                @Override public int compare(KruskalsMST.Edge o1, KruskalsMST.Edge o2)
                {
                    return o1.weight - o2.weight;
                }
            });

            KruskalsMST.kruskals(V1, graphEdges);
        }


        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nPrim");
        {
            PGraph g = new PGraph();
            int V2 = 5;

            //matricea de adiacentas
            int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
                    { 0, 42, 66, 31, 0 } };

            g.Prim(G, V2);
        }
        System.out.println("\n-----------------------------------------------------");



    }
}