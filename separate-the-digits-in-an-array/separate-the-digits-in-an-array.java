class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0){
                int digit = nums[i] % 10;
                st.push(digit);
                nums[i] = nums[i] / 10;
                
            }
            while(!st.empty()){
                temp.add(st.peek());
                st.pop();
            }
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}