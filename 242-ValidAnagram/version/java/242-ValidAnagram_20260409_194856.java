// Last updated: 09/04/2026, 19:48:56
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4        int[] sBucket = new int[26];
5        
6        for(int i = 0; i<s.length(); i++){
7            sBucket[s.codePointAt(i)-97] += 1; 
8            sBucket[t.codePointAt(i)-97] -= 1; 
9        }
10
11        for(int k : sBucket){
12            if(k !=0) return false;
13        }
14        return true;
15    }
16}