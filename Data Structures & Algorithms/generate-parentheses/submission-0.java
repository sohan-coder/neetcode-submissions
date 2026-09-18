class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        bracs(n,ans,s,0,0);
        return ans;
    }
    public void bracs(int n,List<String> ans,StringBuilder s,int open,int close){
        if(open==n && close==n){
            ans.add(s.toString());
            return;
        }
        if(open<n){
        s.append('(');
        bracs(n,ans,s,open+1,close);
        s.deleteCharAt(s.length()-1);
    }
    if(close<open){
        s.append(')');
        bracs(n,ans,s,open,close+1);
        s.deleteCharAt(s.length()-1);
    }
    }
}
