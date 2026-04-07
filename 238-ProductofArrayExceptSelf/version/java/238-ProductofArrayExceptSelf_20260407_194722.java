// Last updated: 07/04/2026, 19:47:22
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4       int[] result = new int[n];
5        result[0] =1;
6
7       for(int i = 1; i < n; i++){
8            result[i] = result[i-1] * nums[i-1]; 
9       }
10
11    int right = 1;
12       for(int j = n-1; j >=0; j--){
13            result[j] *= right;
14            right *= nums[j]; 
15       }
16
17       return result;
18    }
19}