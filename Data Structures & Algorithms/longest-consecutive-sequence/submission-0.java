class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
           map.add(nums[i]); 
        }
        for(int num:map){
          if(!map.contains(num-1)){
            int len=1;
            while(map.contains(num+len)){
            len++;;
          }
          count=Math.max(count,len);
        }
    }
        return count;
    }
}
