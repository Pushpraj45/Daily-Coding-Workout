class Solution {
    public int maxEvents(int[][] events) {
         Arrays.sort(events, (a, b) -> a[0] - b[0]); // Sort events by start day

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int maxEvents = 0;
        int currDay = 0;
        int eventIndex = 0;
        int n = events.length;

        while (eventIndex < n || !minHeap.isEmpty()) {
            if (minHeap.isEmpty()) {
                currDay = events[eventIndex][0];
            }

            while (eventIndex < n && events[eventIndex][0] <= currDay) {
                minHeap.offer(events[eventIndex][1]);
                eventIndex++;
            }

            minHeap.poll(); // Attend the event with the earliest end day
            maxEvents++;
            currDay++;

            while (!minHeap.isEmpty() && minHeap.peek() < currDay) {
                minHeap.poll(); // Remove events that have already ended
            }
        }

        return maxEvents;
    }
}