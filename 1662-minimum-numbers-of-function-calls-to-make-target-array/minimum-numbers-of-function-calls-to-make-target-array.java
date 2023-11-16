class Solution {
    public int minOperations(int[] nums) {
        // int n = nums.length;
        // int ans = 0;
        // while(true){
        //     int index = 0;
        //     int czero = 0;
        //     for(int i=0; i<n; i++){
        //         if((nums[i] & 1) == 1){// Odd is encountered
        //             break;
        //         }

        //         if(nums[i]==0){
        //             czero++;
        //         }
        //     }
        //     if(n==czero){
        //         break;
        //     }

        //     if(index==n){
        //         ans++;

        //         for(int j=0; j<n; j++){
        //             if((nums[j]&1)==0){
        //                 nums[j]/=2;
        //             }
        //         }
        //     }

        //     for(int i=0; i<n; i++){
        //         if((nums[i]&1)!=0){
        //             nums[i]-=1;
        //             ans++;
        //         }
        //     }
        // }
        // return ans; TLE 

        int max = 0;
        int ans = 0;
        for(int var : nums){
            if(var==0){
                continue;

            }
            int temp = 0;
            while(var != 1){
                if(var%2==1) {// Odd came
                ans++;
                var--;
                }
                var/=2; // Even encountered
                temp++;
            } 
            ans++;
            max = Math.max(max,temp);
        }
        return ans+max;
    }
}