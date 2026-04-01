// Last updated: 01/04/2026, 20:36:19
1class Solution {
2    public int climbStairs(int n) {
3        if(n == 1) return 1;
4         int prev = 1, prev2 =1;
5        int result = 0;
6         for(int i = 2; i<=n; i++){
7            result = prev + prev2;
8            prev = prev2;
9            prev2 = result;
10         }
11
12         return result;
13    }
14}
15