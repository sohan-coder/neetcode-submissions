class Solution {
    public String minWindow(String s, String t) {
     HashMap<Character,Integer> m1=new HashMap<>();
     HashMap<Character,Integer> m2=new HashMap<>();
     for(char c : t.toCharArray()){
        m1.put(c,m1.getOrDefault(c,0)+1);
     }
     int req=m1.size();
     int form=0;
     int l=0;
     int start=0;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        m2.put(c,m2.getOrDefault(c,0)+1);
        if(m1.containsKey(c)&& m2.get(c).equals(m1.get(c))){
            form++;
        }
        while(req==form){
            if(i-l+1<min){
                min=i-l+1;
                start=l;
            }
            char old=s.charAt(l);
            m2.put(old,m2.get(old)-1);
            if(m1.containsKey(old)&& m2.get(old)<m1.get(old)){
                form--;

            }
            l++;
        }
     }
     if(min==Integer.MAX_VALUE){
        return "";
     }
     return s.substring(start,start+min);
    }
}