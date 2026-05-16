// Last updated: 16/05/2026, 12:41:03
1class Solution {
2    public int partitionArray(int[] nums, int k) {
3        Arrays.sort(nums);
4        int left = 0;
5        int result = 1;
6
7       for(int right=1; right < nums.length; ++right){
8        if(nums[right] -nums[left] >k){
9            result++;
10            left = right;
11        }
12       }
13
14       return result;
15
16       
17    }
18}