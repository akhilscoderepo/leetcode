// Last updated: 14/05/2026, 18:11:28
1class Solution {
2    public int constrainedSubsetSum(int[] nums, int k) {
3        int  n = nums.length;
4        int[] dp = new int[n];
5        dp[0] = nums[0];
6        Deque<Integer> queue = new LinkedList();
7        queue.offerLast(0);
8        int sum = nums[0];
9
10        for(int i=1; i<n; i++){
11            //check for range of k using queue peek First and i-k
12            while(!queue.isEmpty() && i-k > queue.peekFirst()){
13                queue.pollFirst();
14            }
15            //calc dp[i] using peekfirst and nums[i]
16            dp[i]  = Math.max(0,dp[queue.peekFirst()])+nums[i];
17            sum = Math.max(sum, dp[i]);
18
19            //remove smaller elemnts based on peekLast and i
20            while(!queue.isEmpty() && dp[queue.peekLast()] <= dp[i]){
21                queue.pollLast();
22            }
23            //offerLast currentindex
24            queue.offerLast(i);
25        }
26
27        return sum;
28    }
29}