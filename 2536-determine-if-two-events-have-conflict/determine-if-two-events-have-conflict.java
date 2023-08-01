class Solution {
    private static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }


    public boolean haveConflict(String[] event1, String[] event2) {
       int startTime1 = timeToMinutes(event1[0]);
        int endTime1 = timeToMinutes(event1[1]);
        int startTime2 = timeToMinutes(event2[0]);
        int endTime2 = timeToMinutes(event2[1]);

        int[][] events = {{startTime1, endTime1}, {startTime2, endTime2}};
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        for (int i = 1; i < events.length; i++) {
            if (events[i][0] <= events[i - 1][1]) {
                return true; // Conflict found
            }
        }

        return false; 
    }
}