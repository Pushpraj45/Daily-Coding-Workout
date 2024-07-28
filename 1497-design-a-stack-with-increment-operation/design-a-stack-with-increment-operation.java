class CustomStack {
    Stack<Integer> st = new Stack<>();
    int capacity=0;
    public CustomStack(int maxSize) {
        capacity = maxSize;
    }
    
    public void push(int x) {
        if(st.size()<capacity){
            st.push(x);
            // capactiy--;
        }
    }
    
    public int pop() {
        if(st.size()>0) return st.pop();
        return -1;
    }
    
    public void increment(int k, int val) {
        // Dusre stack mein values dal denge and then will cchange all bottom elements
        Stack<Integer> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }

        for(int i=0; i<k; i++){
            if(st2.size()==0) {break;}
            
                st.push(st2.pop()+val);
            
        }

        while(st2.size()!=0){
            st.push(st2.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */