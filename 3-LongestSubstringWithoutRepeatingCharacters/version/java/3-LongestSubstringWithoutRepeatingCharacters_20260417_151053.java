// Last updated: 17/04/2026, 15:10:53
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int left = 0;
4        int maxLength = 0;
5        HashSet<Character> charSet = new HashSet<>();
6
7        for (int right = 0; right < s.length(); right++) {
8            while (charSet.contains(s.charAt(right))) {
9                charSet.remove(s.charAt(left));
10                left++;
11            }
12
13            charSet.add(s.charAt(right));
14            maxLength = Math.max(maxLength, right - left + 1);
15        }
16
17        return maxLength;       
18    }
19}