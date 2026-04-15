// Last updated: 15/04/2026, 19:47:56
1class Solution {
2    public int removeElement(int[] nums, int val) {
3      int firstValIndex = 0;
4//[2,2,3] 3
5      for(int i = 0 ; i< nums.length; i++){
6            if(nums[i] != val){
7                nums[firstValIndex++] = nums[i];
8            }
9      }
10
11      return firstValIndex;
12    }
13}
14
15//[3,3,3,2,1]
16//[2,3,5,1] - 3
17//[2,3,3,5]-3
18//[3,2,5,1] -3 
19//[1,2,4,3] -3