// Last updated: 08/05/2026, 13:00:20
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Deque<Integer> stack = new ArrayDeque();
4        int result = 0;
5
6        for(int i =0; i <=heights.length; i++){
7            int currentNum = (i==heights.length)?-1:heights[i];
8            while(!stack.isEmpty() && currentNum < heights[stack.peek()]){
9                int prevIndex = stack.pop();
10                int width = i-(stack.isEmpty() ? -1 : stack.peek())-1;
11                result = Math.max(result, width*heights[prevIndex]);
12            }
13            stack.push(i);
14        }
15
16        return result;
17    }
18}