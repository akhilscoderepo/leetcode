// Last updated: 01/05/2026, 11:40:55
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int[] res = new int[temperatures.length];
4        Deque<Integer> stack = new ArrayDeque();
5        Arrays.fill(res,0);
6
7        for(int i = 0; i < temperatures.length; i++){
8            
9            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
10                int index = stack.pop();
11                int diff = i - index;
12                res[index] = diff;
13            }
14
15            stack.push(i);
16        }
17        return res;
18    }
19}