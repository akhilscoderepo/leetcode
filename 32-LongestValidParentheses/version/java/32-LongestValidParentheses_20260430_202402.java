// Last updated: 30/04/2026, 20:24:02
1class Solution {
2    public int longestValidParentheses(String s) {
3        if(s.length() <2) return 0;
4        Deque<Integer> stack = new ArrayDeque();
5        stack.push(-1);
6        int res = 0;
7
8        for(int i =0; i< s.length(); i++){
9            char c = s.charAt(i);
10            if(c == '('){
11                stack.push(i);
12            }else{
13                stack.pop();
14                if(stack.isEmpty()){
15                    stack.push(i);
16                }else{
17                    int length  = i - stack.peek();
18                    res = Math.max(length, res);
19                }
20            }
21        }
22
23        return res;
24    }
25}