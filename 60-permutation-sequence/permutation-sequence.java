class Solution {
    public String getPermutation(int n, int k) {
        // Pure mathematical approach 
        int fact = 1;
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=1; i<n; i++){
            fact = fact*i;
            nums.add(i); // all factorial till n is in the list
        }

        nums.add(n); // as we are following the 0th index technique
        k=k-1;// same reason
        String ans = "";
        while(true){
            int index=k/fact;
            ans = ans+nums.get(index); // us particular block ka vo element le liya humne
            nums.remove(index); // to get new nums size and move k to new block 
            if(nums.size()==0){
                break; // that is where loop will end
            }

            k=k%fact;
            fact = fact/nums.size(); // new list ke size se divide kar denge ab ise
            
        }

        return ans;
    }
}