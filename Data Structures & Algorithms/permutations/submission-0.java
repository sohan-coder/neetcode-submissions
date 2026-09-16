class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        func(nums,temp,ans,freq);
        return ans;
    }
    public void func(int[] nums,List<Integer>temp,List<List<Integer>> ans,boolean[] freq){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                func(nums,temp,ans,freq);
                temp.remove(temp.size()-1);
                freq[i]=false;
            }
        }
    }
}
