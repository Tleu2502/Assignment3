public class Experiment {

    public void runTraversals(Graph g) {
        System.out.println("\n  start test");
        g.printGraph();
        g.bfs(0);
        g.dfs(0);
        System.out.println("  end  \n");
    }

    public void runMultipleTests() {
        System.out.println("  start \n");

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            Graph g = new Graph();
            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }
            for (int i = 0; i < size; i++) {
                for (int j = 1; j <= 3; j++) {
                    int to = (i + j) % size;
                    g.addEdge(i, to);
                }
            }

            System.out.println("Graph  " + size + " vertices:");

            long start = System.nanoTime();
            g.bfs(0);
            long end = System.nanoTime();
            System.out.println("BFS Time: " + (end - start) / 1000000.0 + " ms");

            start = System.nanoTime();
            g.dfs(0);
            end = System.nanoTime();
            System.out.println("DFS Time: " + (end - start) / 1000000.0 + " ms");
            System.out.println();
        }

        System.out.println(" end performence \n");
    }

    public void printResults() {
        System.out.println(" complated ");
    }
}