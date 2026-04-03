// Last updated: 03/04/2026, 16:28:47
1class Solution {
2    public int lengthOfLastWord(String s) {
3       s =  s.trim();
4        int n = s.length()-1;
5
6        while(n>=0 && s.codePointAt(n) != 32){
7            n--;
8        }
9
10        return s.length()-1-n;
11    }
12}