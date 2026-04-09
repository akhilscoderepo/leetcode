// Last updated: 09/04/2026, 16:11:22
1class Solution {
2    public int maxProfit(int[] prices) {
3        int result = 0;
4
5        for(int i = 1; i< prices.length; i++){
6            if(prices[i-1] < prices[i]){
7                result += (prices[i] - prices[i-1]);
8            }
9        }
10
11        return result;
12    }
13}