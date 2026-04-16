// Last updated: 16/04/2026, 12:58:18
1class Solution {
2    public int trap(int[] height) {
3        int i = 0, j = height.length-1;
4        int maxLeft = height[i];
5        int maxRight = height[j];
6        int water  = 0;
7
8        while(j > i){
9            if(maxLeft < maxRight){
10                i++;
11                maxLeft = Math.max(maxLeft, height[i]);
12                water += maxLeft-height[i];
13            }else{
14                j--;
15                maxRight = Math.max(maxRight, height[j]);
16                water += maxRight-height[j];
17            }
18        }
19        return water;
20    }
21}
22//either i or k should be greater than or equal one another
23//j should be less than either i or k
24//unitl we find a number greater than previous high we keep going and the lowest of these two would be max
25//update new max
26//we have to handle case where no water acnn stored
27