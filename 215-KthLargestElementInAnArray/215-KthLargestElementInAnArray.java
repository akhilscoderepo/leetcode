// Last updated: 26/12/2025, 16:01:27
class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length-k];
        
    }
}