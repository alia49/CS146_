def canFinish(numCourses, prerequisites):
    # Create a graph from the prerequisites
    graph = {i: [] for i in range(numCourses)}
    for course, prereq in prerequisites:
        graph[course].append(prereq)

    # Keep track of visited nodes to detect cycles
    visited = [0] * numCourses

    def dfs(course):
        # If the node is visited, a cycle is found
        if visited[course] == -1:
            return False
        # If the node is processed, no cycle is found
        if visited[course] == 1:
            return True
        
        # Mark as visited
        visited[course] = -1
        # Check all adjacent vertices
        for prereq in graph[course]:
            if not dfs(prereq):
                return False
        
        # Mark as processed
        visited[course] = 1
        return True
    
    # Check each course for cycles
    for course in range(numCourses):
        if not dfs(course):
            return False
    
    return True

# Test cases
print("Test Case 1:", canFinish(2, [[1,0]]))  # Expected: True
print("Test Case 2:", canFinish(2, [[1,0], [0,1]]))  # Expected: False

# Add more test cases if needed
