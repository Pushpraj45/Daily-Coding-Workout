class BrowserHistory {
    
    // We will be using 2 stacks first one is to store back history and other one for future and one variable to store curr value
        Stack<String> past = new Stack<>();
        Stack<String> future = new Stack<>();
        String curr;
    public BrowserHistory(String homepage) {
        curr = homepage; // example youtube
    }
    
    public void visit(String url) {
        past.push(curr);
        curr = url;
        future = new Stack<>(); // clear kar diya ek tareeke se
    }
    
    public String back(int steps) {
        while(steps>0 && past.size()>0){
            future.push(curr);
            curr=past.peek();
            past.pop();
            steps--;
        }

        return curr;
    }
    
    public String forward(int steps) {
        while(steps>0 && future.size()>0){
            past.push(curr);
            curr = future.peek();
            future.pop();
            steps--;
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */