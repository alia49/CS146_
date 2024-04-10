
import java.util.List;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Hw7 {

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> allocator = new PriorityQueue<>(intervals.length, (a, b) -> Integer.compare(a, b));
        
        allocator.add(intervals[0][1]);
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= allocator.peek()) {
                allocator.poll();
            }
            allocator.add(intervals[i][1]);
        }
        
        return allocator.size();
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println("Minimum number of meeting rooms required: " + minMeetingRooms(intervals));
        
        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println("Minimum number of meeting rooms required: " + minMeetingRooms(intervals2));
    }
}
