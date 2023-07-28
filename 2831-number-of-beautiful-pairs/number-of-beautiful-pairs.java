class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int first = nums[i];
            while(first>9){
                first=first/10;
            }

            for(int j=i+1; j<nums.length; j++){
                if(gcd(first, nums[j]%10)==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static int gcd(int a, int b){
        int gcd = 1;
    for(int i = 1; i <= a && i <= b; i++)
    {
        if(a%i==0 && b%i==0)
            gcd = i;
    }
    return gcd;
}
}