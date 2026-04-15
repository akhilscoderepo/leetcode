// Last updated: 15/04/2026, 19:27:32
1class Solution {
2    public void moveZeroes(int[] nums) {
3       int indexForZeroLastSeen = 0;
4
5       for(int i =0; i< nums.length; i++){
6            if(nums[i] != 0){
7                nums[indexForZeroLastSeen] = nums[i];
8                indexForZeroLastSeen++;
9            }
10       }
11
12       for(int  j = indexForZeroLastSeen; j < nums.length; j++){
13        nums[j] = 0;
14       }
15    }
16}
17
18