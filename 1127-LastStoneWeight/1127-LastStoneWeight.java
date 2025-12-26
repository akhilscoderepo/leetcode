// Last updated: 26/12/2025, 16:00:07
class Solution {
    public int lastStoneWeight(int[] stones) {
         if (stones == null || stones.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            pq.add(i);
        }
        
        
        while(pq.size()>1){
           pq.add(pq.poll()-pq.poll());
            
        }
        
        return pq.poll();
    }
}