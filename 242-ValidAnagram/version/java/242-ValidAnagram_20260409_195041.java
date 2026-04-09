// Last updated: 09/04/2026, 19:50:41
1class Solution {
2    public boolean isAnagram(String s, String t) {
3       if (s.length() != t.length()) {
4            return false;
5        }
6
7        HashMap<Character, Integer> sCount = new HashMap<>();
8        HashMap<Character, Integer> tCount = new HashMap<>();
9
10        for (int i = 0; i < s.length(); i++) {
11            sCount.put(s.charAt(i), 1 + sCount.getOrDefault(s.charAt(i), 0));
12            tCount.put(t.charAt(i), 1 + tCount.getOrDefault(t.charAt(i), 0));
13        }
14
15        return sCount.equals(tCount); 
16    }
17}