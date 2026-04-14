// Last updated: 14/04/2026, 11:14:42
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3 int minRepeats = (int) Math.ceil((double) b.length() / a.length());
4StringBuilder res = new StringBuilder();
5
6    for (int i = 1; i <= minRepeats + 1; i++) {
7        res.append(a);
8
9        if (res.toString().contains(b)) {
10            return i;
11        }
12    }
13
14    return -1;
15    }
16}