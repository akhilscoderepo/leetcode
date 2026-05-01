// Last updated: 01/05/2026, 10:58:54
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Deque<Integer> stack = new ArrayDeque();
4        HashMap<Integer, Integer> map = new HashMap();
5
6        for(int i =0; i <nums2.length; i++){
7
8            while(!stack.isEmpty() && nums2[i] > stack.peek()){
9                map.put(stack.pop(),nums2[i]);
10            }
11            stack.push(nums2[i]);
12        }
13
14        int[] smallRes = new int[nums1.length];
15        Arrays.fill(smallRes, -1);
16        for(int j = 0; j < nums1.length; j++){
17            smallRes[j] = map.getOrDefault(nums1[j],-1); 
18        }
19
20        return smallRes;
21
22    }
23}