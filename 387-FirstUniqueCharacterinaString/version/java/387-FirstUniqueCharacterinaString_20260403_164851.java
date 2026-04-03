// Last updated: 03/04/2026, 16:48:51
1class Solution {
2    public int firstUniqChar(String s) {
3        for(int  i =0; i< s.length(); i++){
4            char c = s.charAt(i);
5            if(s.indexOf(c, s.indexOf(c)+1) == -1){
6                return s.indexOf(c);
7            }
8        }
9    return -1;
10    }
11}