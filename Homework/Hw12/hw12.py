from typing import List

class Solution:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        parent = list(range(n + 1))
        
        def find(x):
            if parent[x] != x:
                parent[x] = find(parent[x])
            return parent[x]
        
        def union(x, y):
            rootX = find(x)
            rootY = find(y)
            if rootX != rootY:
                parent[rootY] = rootX
                return True
            return False
        
        # Create edges including virtual node 0 to each house with the cost of building a well
        edges = []
        for i in range(n):
            edges.append((wells[i], 0, i + 1))
        
        # Add existing pipes
        for house1, house2, cost in pipes:
            edges.append((cost, house1, house2))
        
        # Sort edges based on the cost
        edges.sort()
        
        total_cost = 0
        edges_used = 0
        
        # Process each edge in increasing order of cost
        for cost, house1, house2 in edges:
            if union(house1, house2):
                total_cost += cost
                edges_used += 1
                if edges_used == n:
                    break
        
        return total_cost

# Example usage:
if __name__ == "__main__":
    sol = Solution()
    n = 2
    wells = [1, 1]
    pipes = [[1, 2, 1], [1, 2, 2]]
    result = sol.minCostToSupplyWater(n, wells, pipes)
    print("Minimum cost to supply water:", result)
