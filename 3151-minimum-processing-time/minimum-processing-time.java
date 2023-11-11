class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder());

        int ans = 0;
        for(int i=0; i<tasks.size(); i++){
            ans = Math.max(ans, processorTime.get(i/4)+tasks.get(i));
        }

        return ans;
    }
}