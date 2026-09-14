class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        func(nums,0,temp,ans);
        return ans;
    }
    public  void func(int[] arr,int i,List<Integer> temp,List<List<Integer>> ans){
        int n=arr.length;
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        func(arr,i+1,temp,ans);
        temp.remove(temp.size()-1);
        func(arr,i+1,temp,ans);

    }
}
