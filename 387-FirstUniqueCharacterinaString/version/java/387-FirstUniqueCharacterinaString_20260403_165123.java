// Last updated: 03/04/2026, 16:51:23
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
4        int n = s.length();
5        // build hash map : character and how often it appears
6        for (int i = 0; i < n; i++) {
7            char c = s.charAt(i);
8            count.put(c, count.getOrDefault(c, 0) + 1);
9        }
10        
11        // find the index
12        for (int i = 0; i < n; i++) {
13            if (count.get(s.charAt(i)) == 1) 
14                return i;
15        }
16        return -1;
17    }
18}