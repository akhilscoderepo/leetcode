// Last updated: 15/04/2026, 19:43:55
1class Solution {
2    public int removeDuplicates(int[] nums) {
3       int firstDuplicate = 0;
4//[1,1,2]
5       for(int i = 0; i< nums.length; i++){
6       if(nums[firstDuplicate] != nums[i]){
7            nums[++firstDuplicate] = nums[i];
8        }
9       }
10       return firstDuplicate+1;
11    }
12}
13