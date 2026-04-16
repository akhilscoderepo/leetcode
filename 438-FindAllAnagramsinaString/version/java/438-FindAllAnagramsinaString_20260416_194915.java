// Last updated: 16/04/2026, 19:49:15
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        int[] freq1 = new int[26]; // Frequency of current window in 's'
4        int[] freq2 = new int[26]; // Frequency of characters in 'p'
5        List<Integer> list = new ArrayList<>();
6
7        // If 's' is shorter than 'p', no anagrams possible
8        if (s.length() < p.length())
9            return list;
10
11        // Initialize frequency arrays with the first 'p.length()' characters
12        for (int i = 0; i < p.length(); i++) {
13            freq1[s.charAt(i) - 'a']++;
14            freq2[p.charAt(i) - 'a']++;
15        }
16
17        int start = 0, end = p.length();
18
19        // Check if initial window is an anagram
20        if (Arrays.equals(freq1, freq2))
21            list.add(start);
22
23        // Slide the window over the rest of 's'
24        while (end < s.length()) {
25            freq1[s.charAt(start) - 'a']--; // Remove leftmost char of previous window
26            freq1[s.charAt(end) - 'a']++;   // Add new char to current window
27
28            start++;
29            end++;
30
31            // If window frequencies match, it's an anagram
32            if (Arrays.equals(freq1, freq2))
33                list.add(start);
34        }
35
36        return list;
37    }
38}