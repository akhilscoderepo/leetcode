// Last updated: 25/04/2026, 14:53:31
class Solution {
    public boolean rotateString(String s, String goal) {
      return s.length() == goal.length() && (s+s).contains(goal);
    }
}