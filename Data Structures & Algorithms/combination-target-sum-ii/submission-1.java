class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,0,target,ans,temp);
        return ans;
    }
    public void find(int[] arr,int i,int t,List<List<Integer>> ans,List<Integer>temp){
            if(t==0){
                ans.add(new ArrayList<>(temp));
                return;
            }
       for(int a=i;a<arr.length;a++){
        if(a>i && arr[a]==arr[a-1]) continue;
        if(arr[a]>t) break;
            temp.add(arr[a]);
            find(arr,a+1,t-arr[a],ans,temp);
            temp.remove(temp.size()-1);
       }
    }
}
