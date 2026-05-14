// Last updated: 14/05/2026, 16:33:09
1class Solution {
2    public long continuousSubarrays(int[] nums) {
3      int limit =2;
4      //two quques
5        //max
6        Deque<Integer> maxD = new LinkedList();
7        //min
8        Deque<Integer> minD = new LinkedList();
9
10        //right
11        //left
12        int left = 0;
13        int right = 0;
14        long max = 0;
15
16        //from 0 to n move the right
17        for(right = 0; right<nums.length; right++){
18             //create min and max quques but checking last element of quque and current number using right index
19             while(!maxD.isEmpty() && maxD.peekLast() < nums[right]){
20                maxD.pollLast();
21             }
22             maxD.offerLast(nums[right]);
23
24             while(!minD.isEmpty() && minD.peekLast() > nums[right]){
25                minD.pollLast();
26             }
27             minD.offerLast(nums[right]);
28        //now for the logic of keeping the max and min under limit
29        //while the max-min > limit its not a legal case, so we remove either left after checking where left points to max or min
30        while(maxD.peekFirst() - minD.peekFirst() >limit){
31            if(maxD.peekFirst() == nums[left]){
32                maxD.pollFirst();
33            }
34
35            if(minD.peekFirst() == nums[left]){
36                minD.pollFirst();
37            }
38
39            left++;
40        }
41        //last calc size using max so far and right-left+1 since zero absed index
42        max +=right-left+1;
43        }
44       return max;
45    }
46}