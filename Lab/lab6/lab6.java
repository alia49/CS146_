import java.util.*;

public class lab6{
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            graph.get(pair[0]).add(pair[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course, graph, visited, recStack)) {
                return false;
            }
        }

        return true;
    }

    private static boolean dfs(int course, ArrayList<ArrayList<Integer>> graph, boolean[] visited, boolean[] recStack) {
        if (recStack[course]) {
            return false;
        }

        if (visited[course]) {
            return true;
        }

        visited[course] = true;
        recStack[course] = true;

        List<Integer> children = graph.get(course);
        for (Integer child : children) {
            if (!dfs(child, graph, visited, recStack)) {
                return false;
            }
        }

        recStack[course] = false;
        return true;
    }

    public static void main(String[] args) {
        // Test Case 1
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println("Test Case 1: " + canFinish(numCourses1, prerequisites1));  // Expected: true

        // Test Case 2
        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println("Test Case 2: " + canFinish(numCourses2, prerequisites2));  // Expected: false
    }
}
