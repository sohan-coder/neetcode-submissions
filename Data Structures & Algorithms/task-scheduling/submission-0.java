class Solution {
    public int leastInterval(char[] tasks, int n) {
      int[] freq=new int[26];
      for(char c : tasks){
        freq[c-'A']++;
      }
      PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<freq.length;i++){
        if(freq[i]>0){
        pq.offer(freq[i]);
      }
      }
      int time=0;
      while(!pq.isEmpty()){
        ArrayList<Integer> temp=new ArrayList<>();
        int cycle=n+1;
        while(cycle>0 && !pq.isEmpty()){
            int count=pq.poll()-1;
            if(count>0){
                temp.add(count);
            }
            time++;
            cycle--;
        }
        for (int count :temp){
            pq.offer(count);
        }
        if(!pq.isEmpty()){
            time+=cycle;
        }
      }
      return time;

    }
}
