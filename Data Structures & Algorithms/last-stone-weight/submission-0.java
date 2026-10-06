class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
        pq.add(stones[i]);
    }
        int x=0;
        int y=0;
        while(pq.size()>=2){
            x=pq.poll();
            y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(pq.isEmpty()) return 0;
        return pq.peek();

    }
}
