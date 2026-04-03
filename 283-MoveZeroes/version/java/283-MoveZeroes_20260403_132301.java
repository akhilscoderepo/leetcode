// Last updated: 03/04/2026, 13:23:01
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int lastZeroSeen = 0;
4
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] != 0){
7                nums[lastZeroSeen++] = nums[i];
8            
9            }
10        }
11
12        for(int j = lastZeroSeen; j < nums.length; j++){
13            nums[j] = 0;
14        }
15    }
16}
17
18