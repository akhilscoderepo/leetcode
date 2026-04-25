// Last updated: 25/04/2026, 15:09:42
1class Solution {
2    public int maxDepth(String s) {
3      int res = 0, cur = 0;
4        for (int i = 0; i < s.length(); ++i) {
5            if (s.charAt(i) == '(')
6                res = Math.max(res, ++cur);
7            if (s.charAt(i) == ')')
8                cur--;
9        }
10        return res;
11
12    }
13}