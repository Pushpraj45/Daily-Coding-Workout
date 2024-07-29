class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack();
		//as we are iterating the array twice total number of elements wil become 2*n-1
        for(int i=2*n-1;i>=0;i--){
		//1st condition 
           if(st.isEmpty()){
               res[i%n]=-1;
           }
		   //2nd condition 
		   //when the ans is top of the stack
            else if(!st.isEmpty() && st.peek()>nums[i%n])
                res[i%n]=st.peek();
				//3rd conditon
				//pop till we find greater element or populate it with -1
            else{
                while(!st.isEmpty() && st.peek()<=nums[i%n])
                {
                    st.pop();
                }
                if(st.isEmpty())
                    res[i%n]=-1;
                else
                    res[i%n]=st.peek();
                
            }
            st.push(nums[i%n]);
        }
        return res;
    }
}