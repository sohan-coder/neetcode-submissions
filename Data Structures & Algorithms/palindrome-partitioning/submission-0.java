class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        func(s,0,ans,temp);
        return ans;
    }
    public void func(String s,int p,List<List<String>> ans,List<String> temp){
        if(p==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=p;i<s.length();i++){
            if(ispali(s,p,i)){
                temp.add(s.substring(p,i+1));
                func(s,i+1,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    Boolean ispali(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
            return false;
        }
        return true;
    }
}
