// Last updated: 07/04/2026, 20:39:24
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currentSum = nums[0], maxSum = nums[0];
4
5        for(int i = 1; i< nums.length; i++){
6        currentSum = Math.max(nums[i], currentSum+nums[i]);
7        maxSum = Math.max(maxSum, currentSum);
8        }
9
10        return maxSum;
11    }
12}