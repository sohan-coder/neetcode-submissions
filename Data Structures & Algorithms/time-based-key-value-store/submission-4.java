class TimeMap {
    class Node{
        String value;
        int timestamp;

        Node(String value,int timestamp){
            this.value=value;
            this.timestamp=timestamp;
        }
    }
    HashMap<String ,List<Node>> map;
    public TimeMap() {
         map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Node(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
       List<Node> list=map.get(key);
       int l=0;
       String ans="";
       int r=list.size()-1;
       while(l<=r){
        int mid=(l+r)/2;
        if(list.get(mid).timestamp<=timestamp){
            ans=list.get(mid).value;
            l=mid+1;
        }
        else{
            r=mid-1;
        }
       } 
       return ans;
    }
}
