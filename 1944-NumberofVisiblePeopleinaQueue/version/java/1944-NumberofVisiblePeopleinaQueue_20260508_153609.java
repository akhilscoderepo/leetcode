// Last updated: 08/05/2026, 15:36:09
1class Solution {
2    public int[] canSeePersonsCount(int[] heights) {
3        Deque<Integer> stack = new ArrayDeque();
4        int  n =heights.length;
5        int[] result = new int[n];
6
7        for(int i =0; i < n; i++){
8            while(!stack.isEmpty() && heights[i] > heights[stack.peek()]){
9                int index = stack.pop();
10                result[index]++;
11            }
12            if(!stack.isEmpty()){
13                result[stack.peek()]++;
14            }
15            stack.push(i);
16        }
17        return result;
18    }
19}
20
21