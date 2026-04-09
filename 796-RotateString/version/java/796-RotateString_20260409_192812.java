// Last updated: 09/04/2026, 19:28:12
1class Solution {
2    public boolean rotateString(String s, String goal) {
3      return s.length() == goal.length() && (s+s).contains(goal);
4    }
5}