// Last updated: 26/12/2025, 16:00:59
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->b-a);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                maxHeap.add(matrix[i][j]);
                if(maxHeap.size()>k){
                    maxHeap.poll();
                }  
            }
        }
        return maxHeap.poll();
    }
}