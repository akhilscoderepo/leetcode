// Last updated: 26/12/2025, 15:59:04
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q= new LinkedList<Integer>();
        
        for(int i=1;i<=n;i++) q.add(i);
        
        while(q.size()!=1){
            for(int j=1;j<k;j++){
                q.add(q.poll());
            }
            q.poll();
        }
        return q.poll();
    }
}
//n>k
//n=k
//n<k


