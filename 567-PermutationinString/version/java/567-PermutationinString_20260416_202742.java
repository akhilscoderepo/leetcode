// Last updated: 16/04/2026, 20:27:42
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length() > s2.length()) return false;
4        int[] bucket1 = new int[26];
5        int[] bucket2 = new int[26];
6
7        for(int i = 0; i< s1.length(); i++){
8            bucket1[s1.charAt(i)-'a']++;
9            bucket2[s2.charAt(i)-'a']++;
10        }
11
12        int start = 0, end = s1.length();
13
14        if(Arrays.equals(bucket1, bucket2)){
15            return true;
16        }
17
18        while(end < s2.length()){
19            bucket2[s2.charAt(start)-'a']--;
20            bucket2[s2.charAt(end)-'a']++;
21
22            start++;
23            end++;
24
25            if(Arrays.equals(bucket1, bucket2)){
26                return true; 
27            }
28        }
29        return false;
30    }
31}