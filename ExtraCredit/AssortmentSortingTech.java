import java.util.PriorityQueue;

public class AssortmentSortingTech {
    private PriorityQueue<Integer> heap;

    public AssortmentSortingTech() {
        this.heap = new PriorityQueue<>();
    }

    public void insert(int element) {
        // Negate the element to simulate min heap behavior in a max heap
        heap.add(-element);
    }

    public int extractMin() {
        // Negate the extracted maximum (which is the minimum in the original values)
        return -heap.poll();
    }

    public static void main(String[] args) {
        AssortmentSortingTech minHeap = new AssortmentSortingTech();
        minHeap.insert(10);
        minHeap.insert(5);
        minHeap.insert(15);
        System.out.println(minHeap.extractMin());  // Outputs: 5, which is the minimum element
    }

