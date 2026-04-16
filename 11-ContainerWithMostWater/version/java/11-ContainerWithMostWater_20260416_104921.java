// Last updated: 16/04/2026, 10:49:21
1class Solution {
2    public int maxArea(int[] height) {
3        int  i =0, n = height.length, j = n-1;
4        int max = 0;
5
6        while(j > i){
7            int start = height[i];
8            int end = height[j];
9            //maximize for product of (j-1) and min(start, end)
10            //since we can't just arrive at a rigid solution with O(1)
11            //We start at each end and based on the local result we update max
12
13            int localArea = (j-i)* Math.min(start, end);
14            max = Math.max(max, localArea);
15
16            if(start < end){
17                i++;
18            }else if(start >= end){
19                j--;
20            }
21        }
22
23        return max;
24    }
25}