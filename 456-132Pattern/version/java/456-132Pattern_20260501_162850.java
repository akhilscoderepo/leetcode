// Last updated: 01/05/2026, 16:28:50
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        if(nums.length <3) return false;
4        int min = nums[0];
5        Deque<int[]> stack = new ArrayDeque();
6
7        for(int i = 1; i < nums.length; i++){
8            while(!stack.isEmpty() && nums[i] >= stack.peek()[0]){
9                stack.pop();
10            }
11
12            if(!stack.isEmpty() && nums[i] > stack.peek()[1]){
13                return true;
14            }
15
16            stack.push(new int[]{nums[i], min = Math.min(min, nums[i])});
17        }
18
19        return false;
20        
21        
22    }
23}