// Last updated: 30/04/2026, 20:32:43
1class Solution {
2    public int longestValidParentheses(String s) {
3        if(s.length() <2) return 0;
4        int open = 0, close =0, max =0;
5
6        for(int i =0; i< s.length(); i++){
7            char c = s.charAt(i);
8            if(c == '('){
9                open++;
10            }else{
11                close++;
12            }
13
14            if(open == close){
15                int length = open+close;
16                max = Math.max(length, max);
17            }else if(close > open){
18                open =0; 
19                close=0;
20
21            }
22        }
23
24        open = 0;
25         close=0;
26          for(int i =s.length()-1; i>=0; i--){
27            char c = s.charAt(i);
28            if(c == '('){
29                open++;
30            }else{
31                close++;
32            }
33
34            if(open == close){
35                int length = open+close;
36                max = Math.max(length, max);
37            }else if(open > close){
38                open =0;
39                close=0;
40            }
41        }
42        return max;
43    }
44}
45
46//Deque<Integer> stack = new ArrayDeque();
47        // stack.push(-1);
48        // int res = 0;
49
50        // for(int i =0; i< s.length(); i++){
51        //     char c = s.charAt(i);
52        //     if(c == '('){
53        //         stack.push(i);
54        //     }else{
55        //         stack.pop();
56        //         if(stack.isEmpty()){
57        //             stack.push(i);
58        //         }else{
59        //             int length  = i - stack.peek();
60        //             res = Math.max(length, res);
61        //         }
62        //     }
63        // }
64
65        // return res;