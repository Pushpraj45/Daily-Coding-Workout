Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
  
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
  
Code -> 
  Brute Force Solution 
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

Optimized One 

class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int revans=target-nums[i];
            if(map.containsKey(revans)){
                return new int[]{map.get(revans), i};
            }
            else{
                map.put(nums[i],i);
            }
                   
                    }
                    return new int[]{-1,-1};
    }
}
  
