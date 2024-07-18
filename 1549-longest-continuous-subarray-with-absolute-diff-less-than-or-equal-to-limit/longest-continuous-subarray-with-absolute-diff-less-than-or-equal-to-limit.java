class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new LinkedList<>();
        Deque<Integer> min = new LinkedList<>();

        int left = 0;
        int right = 0;
        int res = 1;

        while(right<nums.length){
            while(!max.isEmpty() && max.peekLast()<nums[right]){
                max.removeLast();
            }

            max.addLast(nums[right]);

            while(!min.isEmpty() && min.peekLast()>nums[right]){
                min.removeLast();
            }

            min.addLast(nums[right]);
            while(max.peekFirst()-min.peekFirst()>limit){
                if(min.peekFirst()==nums[left]) min.removeFirst();
                if(max.peekFirst()==nums[left]) max.removeFirst();
                left++;

            }
            right++;
            res = Math.max(res, right-left+1);
            
        }

        return res-1;
    }
}