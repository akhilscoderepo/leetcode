// Last updated: 01/04/2026, 20:30:29
1class Solution {
2    public int climbStairs(int n) {
3         int prev = 1, prev2 =1;
4        int result = 0;
5         for(int i = 1; i<n; i++){
6            result = prev + prev2;
7            prev = prev2;
8            prev2 = result;
9         }
10
11         return result==0 ? 1: result;
12    }
13}
14