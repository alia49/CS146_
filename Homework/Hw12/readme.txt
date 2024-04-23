
class hw12:
    Initialize n+1 parents
    Define find(x):
        if x is not its own parent:
            recursively find and set x's parent
        return x's parent
    Define union(x, y):
        find roots of x and y
        if roots are different:
            make one root the parent of the other
            return true
        return false
    Define minCostToSupplyWater(n, wells, pipes):
        Create edge list for all wells and pipes
        Sort edges by cost
        for each edge in sorted list:
            if union of edge's nodes is successful:
                add edge's cost to total cost
                if all nodes are connected:
                    break
        return total cost

main:
    Define n, wells, and pipes
    Create instance of hw12
    Call minCostToSupplyWater and print result
