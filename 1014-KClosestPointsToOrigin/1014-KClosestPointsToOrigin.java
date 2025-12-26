// Last updated: 26/12/2025, 16:00:12
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(k,(p1,p2)->((p1[0]*p1[0]+p1[1]*p1[1])-(p2[0]*p2[0]+p2[1]*p2[1])));
        
       for(int[] point: points){
            pq.add(point);   
       }
        int[][] result = new int[k][2];
        int p=0;
        while(k>0){
            result[--k]=pq.poll();
        }
        return result;
        
    }
    
    
}