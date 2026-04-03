// Last updated: 03/04/2026, 15:55:14
1class Solution {
2    public int removeDuplicates(int[] nums) {
3       int start = 0;
4        int count = 0;
5
6       for(int i =1; i < nums.length; i++){
7            if(nums[start] != nums[i]){
8                nums[++start] = nums[i];
9                count++;
10            }
11       }
12
13       return count+1;
14    }
15}