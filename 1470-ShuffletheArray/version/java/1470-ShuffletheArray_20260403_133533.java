// Last updated: 03/04/2026, 13:35:33
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] result = new int[2*n];
4
5
6        for(int i = 0; i< n; i++){
7             result[i*2]=nums[i];
8            result[2*i+1]=nums[n+i];
9        }
10
11        return result;
12        //[2,3,]
13    }
14}