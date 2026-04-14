// Last updated: 14/04/2026, 19:06:23
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if (s.length() != t.length()) return false;
4
5        int[] mapST = new int[256];
6        int[] mapTS = new int[256];
7
8        for (int i = 0; i < s.length(); i++) {
9            char c1 = s.charAt(i);
10            char c2 = t.charAt(i);
11
12            if (mapST[c1] == 0 && mapTS[c2] == 0) {
13                mapST[c1] = c2;
14                mapTS[c2] = c1;
15            } else {
16                if (mapST[c1] != c2) return false;
17            }
18        }
19        return true;
20    }
21}