
import java.util.*;

public class ToplogicalSort {
    private int V; // Number of vertices
    private ArrayList<ArrayList<Integer>> adj; // Adjacency List

    ToplogicalSort(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<>());
    }

    void addEdge(int v, int w) { adj.get(v).add(w); }

    void topologicalSort() {
        int[] in_degree = new int[V];
        Arrays.fill(in_degree, 0);
        
        for (int i = 0; i < V; i++) {
            for (int node : adj.get(i)) {
                in_degree[node]++;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (in_degree[i] == 0)
                queue.add(i);
        }
        
        int cnt = 0;
        Vector<Integer> topOrder = new Vector<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topOrder.add(u);
            
            for (int node : adj.get(u)) {
                if (--in_degree[node] == 0)
                    queue.add(node);
            }
            cnt++;
        }
        
        if (cnt != V) {
            System.out.println("There exists a cycle in the graph");
            return;
        }
        
        for (int i : topOrder) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String args[]) {
        // Example to test the topologicalSort function
        ToplogicalSort g = new ToplogicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        
        System.out.println("Topological Sort using Kahn's Algorithm:");
        g.topologicalSort();
    }
}
