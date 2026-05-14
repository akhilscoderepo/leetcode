// Last updated: 14/05/2026, 15:53:58
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        Deque<Integer> deque = new LinkedList();
4        int n = nums.length;
5        int[] result = new int[n-k+1];
6        int index = 0;
7
8        for(int i =0; i< n; i++){
9            //remove elemnts that are no longer needed as part of subarray
10            while(!deque.isEmpty() && deque.peekFirst() == i-k){
11                deque.pollFirst();
12            }
13
14            //remove last elemts iuf they are samller to maintain monotonic nature
15            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
16                deque.pollLast();
17            }
18
19            deque.offerLast(i);
20
21            //capture results only when we cross k-1 since 0 based index
22            if(i >= k-1){
23                result[index++] = nums[deque.peekFirst()];
24            }
25        }
26
27        return result;
28    }
29}