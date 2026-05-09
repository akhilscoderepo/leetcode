// Last updated: 09/05/2026, 16:10:55
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3       int time = 0;
4
5       for(int i =0; i< tickets.length; i++){
6            if(i <= k){
7                time += Math.min(tickets[i], tickets[k]);
8            }else if(i >k){
9                time += Math.min(tickets[i], tickets[k] -1);
10            }
11       }
12       return time;
13    }
14}