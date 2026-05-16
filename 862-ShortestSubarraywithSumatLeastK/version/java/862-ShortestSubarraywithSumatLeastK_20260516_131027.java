// Last updated: 16/05/2026, 13:10:27
1class Solution {
2    public int shortestSubarray(int[] nums, int k) {
3        long[] prefix = new long[nums.length+1];
4
5        for(int i =0; i< nums.length; i++){
6            prefix[i+1] =prefix[i]+nums[i];
7        }
8
9        int result = Integer.MAX_VALUE;
10        Deque<Integer> deque = new LinkedList();
11        
12
13        for(int i =0; i<= nums.length; i++){
14
15            while(!deque.isEmpty() && prefix[i] -prefix[deque.peekFirst()] >= k){
16                result = Math.min(result, i-deque.pollFirst());
17            }
18
19            while(!deque.isEmpty() && prefix[i] <= prefix[deque.peekLast()]){
20                deque.pollLast();
21            }
22            deque.offerLast(i);
23
24        }
25
26
27        return result == Integer.MAX_VALUE ? -1 : result;
28    }
29}