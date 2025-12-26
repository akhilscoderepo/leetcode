// Last updated: 26/12/2025, 16:00:27
class KthLargest {
    
    PriorityQueue<Integer> queue= new PriorityQueue<>((a,b)->a-b);
    int size=0;
    public KthLargest(int k, int[] nums) {
        
        this.size=k;
        
        for(int i=0;i<nums.length;i++){
            queue.add(nums[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
    }
    
    public int add(int val) {
        queue.add(val);
        if(queue.size()>size){
            queue.poll();    
        }
                
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//2 3 4 5 8
// 10 9 8
