// Last updated: 26/12/2025, 15:58:56
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer>  pq = new PriorityQueue<Integer>((a,b)->b-a);
         int sum=0;
        for(int i=0;i<piles.length;i++){
            pq.add(piles[i]);
            sum+=piles[i];
        }
        
        for(int j=0;j<k;j++){
            int num=pq.poll();
            sum-=num/2;
            num=num-Integer.valueOf(num/2);
            pq.add(num);
            
        }
        
       
        
        return sum;
    }
}