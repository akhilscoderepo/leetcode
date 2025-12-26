// Last updated: 26/12/2025, 15:59:36
class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int n: nums){
            minHeap.add(n);
            
            if(minHeap.size()>2){
                minHeap.poll();
            }
        }
        
        
        int result = 1;
        
        for(int k: minHeap){
            result *= (k-1);
            
        }
        
        return result;
    }
}