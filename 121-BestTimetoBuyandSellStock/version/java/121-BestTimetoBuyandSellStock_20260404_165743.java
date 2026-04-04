// Last updated: 04/04/2026, 16:57:43
1class Solution {
2    public int maxProfit(int[] prices) {
3        int diff = 0;
4        int slow = 0;
5        int fast  = 0;
6        int n = prices.length;
7
8        while(fast <= n-1){
9            if(prices[fast] < prices[slow]){
10                slow = fast;
11            }
12            diff = Math.max(diff, Math.abs(prices[fast]-prices[slow]));
13            fast++;
14        }
15
16        return diff;
17    }
18}
19
20//use 2 pointers
21//both start at 0 slow and 1 fast
22//if there is smaller no in fast than slow update slow to that index
23//as we move fwd with fast we also check if fast is lower than slow which is same as old step
24//we calc the max of diff