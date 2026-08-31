class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int count=0;
       String low=s.toLowerCase();
       String clean=low.replaceAll("[^a-zA-Z0-9]", "");
       int r=clean.length()-1;
       while(l<r){
        if(clean.charAt(l)!=clean.charAt(r)){
            return false;
        }
        l++;
        r--;
       }
       return true;
    }
}
