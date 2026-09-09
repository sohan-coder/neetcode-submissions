class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            int freq=map.getOrDefault(nums[i],0);
            if(freq>1){
                return nums[i];
            }
        }
        return 0;
    }
}
