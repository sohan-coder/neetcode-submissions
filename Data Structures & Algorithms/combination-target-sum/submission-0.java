class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        find(nums,0,target,ans,temp);
        return ans;
    }
    public void find(int[] arr, int i,int t,List<List<Integer>> ans,List<Integer> temp){
        if(i==arr.length){
            if(t==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[i]<=t){
            temp.add(arr[i]);
            find(arr,i,t-arr[i],ans,temp);
            temp.remove(temp.size()-1);
        }
        find(arr,i+1,t,ans,temp);
    }
}
