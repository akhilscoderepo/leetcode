// Last updated: 25/04/2026, 17:16:39
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Deque<Integer> stack = new ArrayDeque();
4
5        for(String token : tokens){
6            if(token.equals("+")){
7                if(!stack.isEmpty()){
8                    int first = stack.pop();
9                    int second  = stack.pop();
10                    stack.push(first+second);
11                }
12            }else if(token.equals("-")){
13                 if(!stack.isEmpty()){
14                    int first = stack.pop();
15                    int second  = stack.pop();
16                    stack.push(second-first);
17                }
18            }else if(token.equals("*")){
19                 if(!stack.isEmpty()){
20                    int first = stack.pop();
21                    int second  = stack.pop();
22                    stack.push(first*second);
23                }
24            }else if(token.equals("/")){
25                 if(!stack.isEmpty()){
26                    int first = stack.pop();
27                    int second  = stack.pop();
28                    stack.push(second/first);
29                }
30            }else{
31                stack.push(Integer.valueOf(token));
32            }
33        }
34        return stack.pop();
35    }
36}