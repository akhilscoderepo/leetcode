// Last updated: 26/12/2025, 15:59:28
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        Deque<int[]> queue = new LinkedList<int[]>();
        
        for(int[] point: points){
            
            while(!queue.isEmpty() && point[0]-queue.getFirst()[0] > k){
                queue.pollFirst();
            }
            if(!queue.isEmpty()){
                max=Math.max(max,(-queue.getFirst()[0]+queue.getFirst()[1]+point[0]+point[1]));
            }
            
            while(!queue.isEmpty() && queue.getLast()[1]-queue.getLast()[0] <= point[1]-point[0]){
             queue.pollLast();
            }
            queue.add(point);
        }
        
        return max;
        
        
    }
    
}