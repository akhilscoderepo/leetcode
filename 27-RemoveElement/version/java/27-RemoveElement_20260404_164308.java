// Last updated: 04/04/2026, 16:43:08
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int k = 0;
4
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] != val){
7                nums[k] = nums[i];
8                k++;
9            }
10        }
11    return k;
12    }
13}
14
15//[3,3,3,2,1]
16//[2,3,5,1] - 3
17//[2,3,3,5]-3
18//[3,2,5,1] -3 
19//[1,2,4,3] -3