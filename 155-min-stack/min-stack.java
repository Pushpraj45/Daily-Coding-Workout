// class MinStack {
//     Stack<Integer> s;
//     Stack<Integer> ss;
//     public MinStack() {
//         s = new Stack<>();
//         ss = new Stack<>();
//     }
    
//     public void push(int val) {
//          s.push(val);
// 	    if(ss.empty() || val<=ss.peek())
// 	        ss.push(val);
//     }
    
//     public void pop() {
//         if((int)ss.peek()==(int)s.peek()){
//             ss.pop();
//         }
//         s.pop();
//     }
    
//     public int top() {
//         if(s.empty())
//             return -1;
//         return s.peek();
//     }
    
//     public int getMin() {
//         if(ss.empty())
//             return -1;
//         else
//             return ss.peek();
//     }
// }
class MinStack {
    Stack s;
    long minelement;
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push((long)val);
            minelement = (long)val;
        }
        else{
            if((long)val >= minelement)
                s.push((long)val);
            else{
                s.push(2*(long)(val)-minelement);
                minelement = (long)val;
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty())
            return;
        if((long)s.peek() >= minelement)
            s.pop();
        else{
            minelement = 2*minelement - (long)s.peek();
            s.pop();
        }
    }
    
    public int top() {
        if(s.isEmpty())
            return -1;
        else{
            long top = (long)s.peek();
            if((long)s.peek() >= minelement)
                return (int)top;
            else{
                return (int)minelement;
            }
        }

    }
    
    public int getMin() {
        if(s.isEmpty())
            return -1;
        return (int)minelement;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */