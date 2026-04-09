// Last updated: 09/04/2026, 16:41:07
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long count = 0, streak = 0;
4
5        for(int n : nums){
6            streak = (n ==0) ? (streak +1) : 0;
7            count += streak;
8        }
9
10        return count;
11    }
12
13}