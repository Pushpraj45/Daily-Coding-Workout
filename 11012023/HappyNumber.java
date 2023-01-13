class Solution {
    public boolean isHappy(int n) {
        Set <Integer> myset=new HashSet<>();

        while(n!=1){
            int curr = n;
            int sum = 0;

            while(curr!=0){
                int rem=curr%10;
                sum = sum + (rem*rem);
                curr=curr/10;
            }
            if(myset.contains(sum)){
                return false;
            }

            n=sum;
            myset.add(n);
        }
        return true;
    }
}