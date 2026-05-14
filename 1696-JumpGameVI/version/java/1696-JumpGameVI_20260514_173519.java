// Last updated: 14/05/2026, 17:35:19
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Deque<Integer> queue = new LinkedList();
6        queue.offerLast(0);
7        dp[0] = nums[0];
8
9        for(int i =1; i< n; i++){
10            //we check for the range of k first
11            while(!queue.isEmpty() && queue.peekFirst() < i-k){
12                queue.pollFirst();
13            }
14            //we calc dp[i] using past dp from peekFirst and nums[i]
15            dp[i] = dp[queue.peekFirst()] + nums[i];
16            //we remove smaller nhumbers of exists and store index in queue
17            //queue track dp not nums
18            while(!queue.isEmpty() && dp[queue.peekLast()] <= dp[i]){
19                queue.pollLast();
20            }
21            queue.offerLast(i);
22        }
23
24        return dp[n-1];
25        
26    }
27}