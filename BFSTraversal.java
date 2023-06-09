import java.util.*;

class BFSTraversal {

    private static int V;
    private static LinkedList<Integer> adj[];

    BFSTraversal(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    static List<Integer> BFS(int s) {
        boolean visited[] = new boolean[V];
        List<Integer> traversal = new ArrayList<>();

        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            traversal.add(s);

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        return traversal;
    }

    public static void main(String args[]) {
        BFSTraversal g = new BFSTraversal(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");

        List<Integer> traversal = BFS(2);
        for (int vertex : traversal) {
            System.out.print(vertex + " ");
        }
    }
}
