// Last updated: 10/04/2026, 10:35:23
1class Solution {
2    public boolean isPalindrome(String s) {
3        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
4       int start = 0, end=s.length()-1;
5
6       while(end>start){
7        if(s.charAt(start)!=s.charAt(end)){
8            return false;
9        }
10        end--;
11        start++;
12       } 
13       
14        return true;
15    }
16}