// Last updated: 08/05/2026, 13:03:43
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Deque<Integer> stack = new ArrayDeque();
4        int result = 0;
5
6        for(int i =0; i <=heights.length; i++){
7            int next = (i==heights.length)?-1:heights[i];
8            while(!stack.isEmpty() && next < heights[stack.peek()]){
9                int curr = stack.pop();
10                int width = i-(stack.isEmpty() ? -1 : stack.peek())-1;
11                result = Math.max(result, width*heights[curr]);
12            }
13            stack.push(i);
14        }
15
16        return result;
17    }
18}