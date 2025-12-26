// Last updated: 26/12/2025, 15:58:59
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        return ((nums[length-1]*nums[length-2])-(nums[0]*nums[1]));
        
    }
}