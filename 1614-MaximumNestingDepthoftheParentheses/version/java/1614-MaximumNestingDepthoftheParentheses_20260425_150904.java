// Last updated: 25/04/2026, 15:09:04
1class Solution {
2    public int maxDepth(String s) {
3        Deque<Character> stack = new ArrayDeque();
4        int max = 0;
5
6        for(char c: s.toCharArray()){
7            if(c == '('){
8                stack.push('(');
9            }else if(c ==')' && !stack.isEmpty() && stack.peek() == '('){
10                max = Math.max(stack.size(), max);
11                stack.pop();
12                
13            }
14            
15        }
16
17        return max;
18    }
19}