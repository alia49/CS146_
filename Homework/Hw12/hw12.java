import java.util.*;

public class hw12 {
    private int[] parent;

    public hw12(int n) {
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootY] = rootX;
            return true;
        }
        return false;
    }

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        List<int[]> edges = new ArrayList<>();

        // Adding virtual node 0 connections with wells cost
        for (int i = 0; i < n; i++) {
            edges.add(new int[] {wells[i], 0, i + 1});
        }

        // Adding pipes
        for (int[] pipe : pipes) {
            edges.add(new int[] {pipe[2], pipe[0], pipe[1]});
        }

        // Sort edges based on cost
        Collections.sort(edges, Comparator.comparingInt(a -> a[0]));

        int totalCost = 0;
        int edgesUsed = 0;

        // Process each edge and form the MST
        for (int[] edge : edges) {
            if (union(edge[1], edge[2])) {
                totalCost += edge[0];
                edgesUsed++;
                if (edgesUsed == n) {
                    break;
                }
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] wells = {1, 1};
        int[][] pipes = {{1, 2, 1}, {1, 2, 2}};
        hw12 solution = new hw12(n);
        int result = solution.minCostToSupplyWater(n, wells, pipes);
        System.out.println("Minimum cost to supply water: " + result);
    }
}
