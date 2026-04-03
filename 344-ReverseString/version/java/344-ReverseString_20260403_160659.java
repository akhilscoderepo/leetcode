// Last updated: 03/04/2026, 16:06:59
1class Solution {
2    public void reverseString(char[] s) {
3        for(int i = 0; i< s.length/2; i++){
4            char temp = s[s.length -1 - i];
5            s[s.length -1 - i] = s[i];
6            s[i] = temp;
7        }
8    }
9}