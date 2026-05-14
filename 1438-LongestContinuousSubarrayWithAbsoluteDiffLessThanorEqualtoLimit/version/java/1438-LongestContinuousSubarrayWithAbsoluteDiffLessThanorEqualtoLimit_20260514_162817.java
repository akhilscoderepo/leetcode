// Last updated: 14/05/2026, 16:28:17
1class Solution {
2    public int longestSubarray(int[] nums, int limit) {
3        //two quques
4        //max
5        Deque<Integer> maxD = new LinkedList();
6        //min
7        Deque<Integer> minD = new LinkedList();
8
9        //right
10        //left
11        int left = 0;
12        int right = 0;
13        int max = 0;
14
15        //from 0 to n move the right
16        for(right = 0; right<nums.length; right++){
17             //create min and max quques but checking last element of quque and current number using right index
18             while(!maxD.isEmpty() && maxD.peekLast() < nums[right]){
19                maxD.pollLast();
20             }
21             maxD.offerLast(nums[right]);
22
23             while(!minD.isEmpty() && minD.peekLast() > nums[right]){
24                minD.pollLast();
25             }
26             minD.offerLast(nums[right]);
27        //now for the logic of keeping the max and min under limit
28        //while the max-min > limit its not a legal case, so we remove either left after checking where left points to max or min
29        while(maxD.peekFirst() - minD.peekFirst() >limit){
30            if(maxD.peekFirst() == nums[left]){
31                maxD.pollFirst();
32            }
33
34            if(minD.peekFirst() == nums[left]){
35                minD.pollFirst();
36            }
37
38            left++;
39        }
40        //last calc size using max so far and right-left+1 since zero absed index
41        max = Math.max(max, right-left+1);
42        }
43       return max;
44    }
45}