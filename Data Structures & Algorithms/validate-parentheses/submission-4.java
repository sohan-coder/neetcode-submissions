class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for (char c:s.toCharArray()){
            if(c=='(' || c=='['||c=='{'){
                st.push(c);
            }
            else{
            if(st.isEmpty()) return false;
            char ch=st.peek();
            if(ch=='(' && c==')'||ch=='[' && c==']'||ch=='{' && c=='}'){
                st.pop();
            }
            else{
                return false;
            }
            }
        }
            return st.isEmpty();
        }
    }

