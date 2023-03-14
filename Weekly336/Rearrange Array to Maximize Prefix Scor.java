class Solution {
public:
    int maxScore(vector<int>& nums) {
        sort(nums.begin(), nums.end(), greater<int>());
        int s=nums.size();
        int result = 0;
        vector<long long>temp(s);
        temp[0]=nums[0];
        if(temp[0]>0){
            result++;
        }
        for(int k=1; k<s; k++){
            temp[k]=temp[k-1]+nums[k];
            if(temp[k]>0){
                result++;
            }
        }
        return result;
    }
};