// Last updated: 03/04/2026, 16:24:49
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] split = s.split(" ");
4        return split[split.length-1].length();
5    }
6}