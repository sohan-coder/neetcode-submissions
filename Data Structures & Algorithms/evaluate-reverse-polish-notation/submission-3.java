class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int a=0;
        int b=0;
        String token="";
        for(int c=0;c<tokens.length;c++){
            token=tokens[c];
            if(token.equals("+")||
            token.equals("-")||
            token.equals("*")||
            token.equals("/")){
                b=st.pop();
                a=st.pop();
                switch (token){
                case "+":
                st.push(a+b);
                break;
                 case "-":
                st.push(a-b);
                break;
                 case "*":
                st.push(a*b);
                break;
                 case "/":
               if(b!=0) st.push(a/b);
               else {
                st.push(b/a);
               }
                break;
            }
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}
