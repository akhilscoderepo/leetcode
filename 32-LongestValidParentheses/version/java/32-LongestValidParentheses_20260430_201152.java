// Last updated: 30/04/2026, 20:11:52
1class Solution {
2    public int longestValidParentheses(String s) {
3        if(s.length() <2) return 0;
4        Deque<Integer> stack = new ArrayDeque();
5        int res = 0;
6
7        for(int i =0; i< s.length(); i++){
8            char c = s.charAt(i);
9            if(c == '('){
10                stack.push(i);
11            }else{
12                if(stack.isEmpty()){
13                    stack.push(i);
14                }else{
15                    if(s.charAt(stack.peek()) == '('){
16                        stack.pop();
17                        res = Math.max(i-(stack.isEmpty()?-1:stack.peek()), res);
18                    }else{
19                        stack.push(i);
20                    }
21                }
22            }
23        }
24
25        return res;
26    }
27}