// Last updated: 17/04/2026, 16:55:06
1class Solution {
2    public String minWindow(String s, String t) {
3        if(t.length() > s.length()) return "";
4
5        int start = 0, end=0, minLen=Integer.MAX_VALUE, startIndex=0;
6        int count = t.length();
7        int[] tMap = new int[128];
8
9        for(char tChar : t.toCharArray()){
10            tMap[tChar]++;
11        }
12        char[] chS = s.toCharArray();
13
14      while(end < s.length()){
15        if(tMap[chS[end++]]-- > 0){
16            count--;
17        }
18
19        while(count == 0){
20            if(end-start < minLen){
21                startIndex = start;
22                minLen = end-start;
23            }
24
25            if(tMap[chS[start++]]++ == 0){
26            count++;
27        }
28        }
29        
30      }
31
32      return minLen == Integer.MAX_VALUE ? "" : new String(chS, startIndex, minLen);
33
34
35    }
36}