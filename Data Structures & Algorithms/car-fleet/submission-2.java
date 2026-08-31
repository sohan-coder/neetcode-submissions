class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st=new Stack<>();
        int n=position.length;
        int[][] car=new int[n][2];
        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<n;i++){
            double time=(double)(target-car[i][0])/car[i][1];
            if(st.isEmpty()||time>st.peek()){
                st.push(time);
            }
        }
        return st.size();
    }
}
