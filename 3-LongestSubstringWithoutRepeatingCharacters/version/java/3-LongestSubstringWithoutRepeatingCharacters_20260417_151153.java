// Last updated: 17/04/2026, 15:11:53
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int maxLength = 0;
5        Map<Character, Integer> charMap = new HashMap<>();
6        int left = 0;
7        
8        for (int right = 0; right < n; right++) {
9            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
10                charMap.put(s.charAt(right), right);
11                maxLength = Math.max(maxLength, right - left + 1);
12            } else {
13                left = charMap.get(s.charAt(right)) + 1;
14                charMap.put(s.charAt(right), right);
15            }
16        }
17        
18        return maxLength;
19    }
20}