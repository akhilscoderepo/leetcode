// Last updated: 30/04/2026, 11:46:09
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3        Deque<Character> stack = new ArrayDeque();
4        Deque<Integer> open = new ArrayDeque();
5        Deque<Integer> close = new ArrayDeque();
6        int index = 0;
7
8        for(char c : s.toCharArray()){
9            if(c=='('){
10                stack.push('(');
11                open.push(index);
12            }else if(c == ')' ){
13                if(!stack.isEmpty()){
14                    stack.pop();
15                    open.pop();
16                }else{
17                    close.push(index);
18                }
19            }
20            index++;
21        }
22
23        StringBuilder sb = new StringBuilder(s);
24        while(!open.isEmpty()){
25            sb.deleteCharAt(open.pop());
26        }
27
28        while(!close.isEmpty()){
29            sb.deleteCharAt(close.pop());
30        }
31
32        return sb.toString();
33    }
34}