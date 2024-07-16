class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i =0;
        int j =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        int sum = 0;

        while(j<nums.length){
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);

            sum+=nums[j];

            if(map.size()==j-i+1){
                ans = Math.max(sum, ans);
                j++;
            }

            else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    sum-=nums[i];
                    map.put(nums[i], map.get(nums[i])-1);
                    if(map.get(nums[i])==0){
                        map.remove(nums[i]);
                    }
                    i++;
                }

                 if(map.size()==j-i+1){
                ans = Math.max(sum, ans);
            }
                j++;

            }

        }

        return ans;
    }
}