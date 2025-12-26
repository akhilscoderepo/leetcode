// Last updated: 26/12/2025, 15:59:33
class Solution {
    public int[] runningSum(int[] nums) {

        
        
        for(int i=1; i<nums.length; i++){
         nums[i]+=nums[i-1];
        }
        
        return nums;
        
    }
}