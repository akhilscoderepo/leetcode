// Last updated: 14/04/2026, 19:07:28
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length() != t.length()) return false;
4
5        int[] sBucket = new int[256];
6        int[] tBucket = new int[256];
7
8        for(int i=0; i< s.length(); i++){
9            char schar = s.charAt(i);
10            char tchar = t.charAt(i);
11
12            if(sBucket[schar] == 0 && tBucket[tchar] == 0){
13                sBucket[schar] = tchar;
14                tBucket[tchar] = schar;
15            }else if(sBucket[schar] != tchar){
16                return false;
17            }
18        }
19        return true;
20    }
21}