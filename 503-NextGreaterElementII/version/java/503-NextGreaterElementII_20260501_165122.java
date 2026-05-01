// Last updated: 01/05/2026, 16:51:22
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Deque<Integer> stack = new ArrayDeque();
4        int[] result = new int[nums.length];
5        Arrays.fill(result, -1);
6
7        for(int i= 0; i<2*nums.length; i++){
8            int index = i%nums.length;
9            while(!stack.isEmpty() && nums[index] > nums[stack.peek()]){
10                int j = stack.pop();
11                result[j] = nums[index];
12            }
13           if(i < nums.length) stack.push(i);
14        }
15        return result;
16    }
17}