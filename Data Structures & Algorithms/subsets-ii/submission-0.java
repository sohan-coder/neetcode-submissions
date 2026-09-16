class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        func(nums,ans,temp,0);
        return ans;
    }
    public void func(int[] nums,List<List<Integer>> ans,List<Integer> temp,int n){
            ans.add(new ArrayList<>(temp));
        for(int i =n;i<nums.length;i++){
            if(i!=n && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            func(nums,ans,temp,i+1);
            temp.remove(temp.size()-1);
                    }
    }
}
