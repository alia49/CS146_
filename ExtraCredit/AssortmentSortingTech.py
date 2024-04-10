import heapq

class MinHeapViaMaxHeap:
    def __init__(self):
        self.heap = []

    def insert(self, element):
        # Negate the element to simulate min heap behavior in a max heap
        heapq.heappush(self.heap, -element)

    def extractMin(self):
        # Negate the extracted maximum (which is the minimum in the original values)
        return -heapq.heappop(self.heap)

# Usage example
minHeap = MinHeapViaMaxHeap()
minHeap.insert(10)
minHeap.insert(5)
minHeap.insert(15)
minHeap.insert(20)
minHeap.insert(18)
print(minHeap.extractMin())  
