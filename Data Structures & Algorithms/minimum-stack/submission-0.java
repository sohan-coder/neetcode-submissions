class MinStack {
    Stack<Integer> st;
    Stack<Integer> mnst;

    public MinStack() {
        st=new Stack<>();
        mnst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(mnst.isEmpty()){
        mnst.push(val);
    }
    else{
        mnst.push(Math.min(val,mnst.peek()));
    }
    }
    
    public void pop() {
        st.pop();
        mnst.pop();
    }
    
    public int top() {
       return  st.peek();
    }
    
    public int getMin() {
        return mnst.peek();
    }
}
