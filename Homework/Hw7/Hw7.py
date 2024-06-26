from typing import List
import heapq

class Hw7:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        if not intervals:
            return 0

        # Start by sorting the intervals by the start time.
        intervals.sort(key=lambda x: x[0])

        # Initialize a heap.
        heap = []

        # Add the first meeting. We have to give a new room to the first meeting.
        heapq.heappush(heap, intervals[0][1])

        # For all the remaining meeting intervals...
        for interval in intervals[1:]:
            # If the room due to free up the earliest is free, assign that room to this meeting.
            if heap[0] <= interval[0]:
                heapq.heappop(heap)

            # If a new room is to be assigned, then also we add to the heap.
            # If an old room is allocated, then also we have to add to the heap with updated end time.
            heapq.heappush(heap, interval[1])

        # The size of the heap tells us the minimum rooms required for all the meetings.
        return len(heap)

hw7 = Hw7()
intervals = [[0, 30], [5, 10], [15, 20]]
print(hw7.minMeetingRooms(intervals))  # Output: 2
