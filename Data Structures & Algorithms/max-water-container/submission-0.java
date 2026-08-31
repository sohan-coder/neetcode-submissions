class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int n=nums.length;
        int min=0;
        int s=0;
        int f=n-1;
        while(s<f){
            int width=f-s;
            int area=Math.min(nums[s],nums[f])*width;
            max=Math.max(max,area);
            if(nums[s]<=nums[f]){
                s++;
            }
            else{
                f--;
            }
        }
        return max;
    }
}
