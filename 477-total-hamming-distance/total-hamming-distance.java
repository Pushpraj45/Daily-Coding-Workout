class Solution {
    public int totalHammingDistance(int[] nums) {
    //      int n = nums.length;
    //     int totalDistance = 0;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             totalDistance += hamdist(nums[i], nums[j]);
    //         }
    //     }

    //     return totalDistance;
    // }
    // public int hamdist(int a , int b){
    //     int dist = 0;
    //     while(a>0 || b>0){
    //         if((a&(1))!=(b&1)){
    //             dist++;
    //         }
    //         a>>=1;
    //         b>>=1;
    //     }
    //     return dist; TLE 
    int len = nums.length; 
    int ans = 0;
    for(int i=0; i<32; i++){
        int cones=0;
        for(int j=0; j<len; j++){
            if((nums[j] & 1)==1){
                cones++;
            }
            nums[j]>>=1;
        }

        ans+=(cones)*(len-cones);
    }
    return ans;
    }
}

