// Last updated: 02/05/2026, 16:30:59
1class Solution {
2    public int maxWidthRamp(int[] nums) {
3        Deque<Integer> stack = new ArrayDeque<Integer>();
4
5        for(int i =0; i< nums.length;i++){
6            while(stack.isEmpty() || nums[stack.peek()] > nums[i]){
7                stack.push(i);
8            }
9        }
10
11        int max = 0;
12       for(int j = nums.length-1; j>=0; j--){
13        while(!stack.isEmpty() && nums[j] >=nums[stack.peek()]){
14            max = Math.max(max, j-stack.pop());
15        }
16       }
17
18        return max;
19    }
20}