// Last updated: 15/04/2026, 19:32:03
1class Solution {
2    public int majorityElement(int[] nums) {
3        Arrays.sort(nums);
4      return nums[nums.length/2];
5    }
6}
7
8