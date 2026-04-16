// Last updated: 16/04/2026, 20:29:02
1public class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if (s1.length() > s2.length())
4            return false;
5        int[] s1arr = new int[26];
6        int[] s2arr = new int[26];
7        for (int i = 0; i < s1.length(); i++) {
8            s1arr[s1.charAt(i) - 'a']++;
9            s2arr[s2.charAt(i) - 'a']++;
10        }
11        for (int i = 0; i < s2.length() - s1.length(); i++) {
12            if (matches(s1arr, s2arr))
13                return true;
14            s2arr[s2.charAt(i + s1.length()) - 'a']++;
15            s2arr[s2.charAt(i) - 'a']--;
16        }
17        return matches(s1arr, s2arr);
18    }
19
20    public boolean matches(int[] s1arr, int[] s2arr) {
21        for (int i = 0; i < 26; i++) {
22            if (s1arr[i] != s2arr[i])
23                return false;
24        }
25        return true;
26    }
27}