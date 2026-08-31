class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return binary(0,n-1,target,nums);
        }
    public int binary(int l,int r,int target,int[] nums){
        if(l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if(target==nums[mid]){
            return mid;
        }
        else if(target<nums[mid]){
           return binary(l,mid-1,target,nums);
        }
        else{
            l=mid+1;
            return binary(mid+1,r,target,nums);
        }
    }
}
