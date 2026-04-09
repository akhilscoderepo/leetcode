// Last updated: 09/04/2026, 19:47:07
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4        int[] sBucket = new int[26];
5        int[] tBucket = new int[26];
6        
7        for(int i = 0; i<s.length(); i++){
8            sBucket[s.codePointAt(i)-97] += 1; 
9        tBucket[t.codePointAt(i)-97] += 1; 
10        }
11
12        for(int  j=0; j< 26; j++){
13            if(sBucket[j] != tBucket[j]) return false;
14        }
15        return true;
16    }
17}