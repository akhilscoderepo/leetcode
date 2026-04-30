// Last updated: 30/04/2026, 12:19:47
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3        Stack<Integer> stack = new Stack<>();
4        for(int i=0;i<s.length();i++) {
5            char c = s.charAt(i);
6
7            if(Character.isAlphabetic(c)){
8                continue;
9            }
10
11            if(c =='('){
12                stack.push(i);
13            }else{
14                if(!stack.isEmpty() && s.charAt(stack.peek()) == '('){
15                    stack.pop();
16                }else{
17                    stack.push(i);
18                }
19            }
20        }
21
22        HashSet<Integer> set = new HashSet(stack);
23        StringBuilder result = new StringBuilder();
24
25        for(int j = 0; j < s.length(); j++){
26            if(!set.contains(j)){
27                result.append(s.charAt(j));
28            }
29        }
30        return result.toString();
31    }
32}