class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        if(digits.length()==0) 
        return ans;
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        func(digits,map,0,ans,s);
        return ans;
    }
    public void func(String digits,String[] map,int ind,List<String> ans,StringBuilder s){
        if(ind==digits.length()){
            ans.add(s.toString());
            return;
        }
        int d=digits.charAt(ind);
        String letters=map[d-'0'];
        for(int i=0;i<letters.length();i++){
            s.append(letters.charAt(i));
            func(digits,map,ind+1,ans,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
