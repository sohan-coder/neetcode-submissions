class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int sum=0;
        int len=numbers.length;
        int r=len-1;
        while(l<r){
            sum=numbers[l]+numbers[r];
            if(sum==target){
                return new int[]{l+1,r+1};
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int []{-1,-1};
    }
}
