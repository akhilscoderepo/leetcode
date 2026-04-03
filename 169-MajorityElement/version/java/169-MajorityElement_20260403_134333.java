// Last updated: 03/04/2026, 13:43:33
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4        return nums[nums.length/2];
5    }
6}