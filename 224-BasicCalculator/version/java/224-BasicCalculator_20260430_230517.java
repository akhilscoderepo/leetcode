// Last updated: 30/04/2026, 23:05:17
1class Solution {
2    public int calculate(String s) {
3        Deque<Integer> stack = new ArrayDeque();
4        int num = 0;
5        int sign = 1;
6        int res = 0;
7
8        for(char c : s.toCharArray()){
9            if(c == ' ') continue;
10            if(Character.isDigit(c)){
11                num = num*10+(c-'0');
12            }
13
14            if(c == '+'){
15                res += num*sign;
16                sign = 1;
17                num =0;
18            }else if(c =='-'){
19               res += num*sign;
20                sign = -1;
21                num =0;
22            }else if(c == '('){
23               stack.push(res);
24               stack.push(sign);
25               num =0;
26               res =0;
27               sign =1;
28            }else if(c ==')'){
29                res += num*sign;
30                num =0;
31                res *= stack.pop();
32                res += stack.pop();
33            }
34        }
35
36        res +=sign*num;
37        return res;
38        
39    }
40}