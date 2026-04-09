// Last updated: 09/04/2026, 19:39:03
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.length() > haystack.length()) return -1;
4
5        return haystack.indexOf(needle);
6    }
7}