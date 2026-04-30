// Last updated: 30/04/2026, 10:48:54
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3        Deque<Integer> stack = new ArrayDeque();
4        int n = popped.length;
5        int j = 0;
6
7        for(int i = 0; i < n; i++){
8            stack.push(pushed[i]);
9        
10            while(!stack.isEmpty() && stack.peek() == popped[j]){
11                stack.pop();
12                j++;
13            }
14        
15        }
16        if(stack.size() == 0 && j == n){
17            return true;
18        }
19        return false;
20    }
21}