// Last updated: 25/04/2026, 15:44:44
1class Solution {
2    public String removeStars(String s) {
3        Deque<Character> stack = new ArrayDeque();
4
5        for(char c : s.toCharArray()){
6            if(c == '*' && !stack.isEmpty()){
7                stack.pop();
8            }else{
9                stack.push(c);
10            }
11        }
12
13        StringBuilder sb = new StringBuilder();
14        while(!stack.isEmpty()){
15            sb.append(stack.pop());
16        }
17        return sb.reverse().toString();
18    }
19}