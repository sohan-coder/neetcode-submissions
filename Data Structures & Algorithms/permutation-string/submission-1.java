class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        for(char c:s1.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        int n=s1.length();
        for(int i=0;i<n;i++){
            char c=s2.charAt(i);
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        if(m1.equals(m2)){
            return true;
        }
        for(int i=n;i<s2.length();i++){
            char c2=s2.charAt(i);
            m2.put(c2,m2.getOrDefault(c2,0)+1);
            char old=s2.charAt(i-n);
            m2.put(old, m2.get(old) - 1);
            if (m2.get(old) == 0) { 
                m2.remove(old); 
                } 
                if (m1.equals(m2)) { 
                    return true;
        }
    }
    return false;
    }
}
