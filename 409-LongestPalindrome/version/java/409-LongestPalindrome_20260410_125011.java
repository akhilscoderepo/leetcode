// Last updated: 10/04/2026, 12:50:11
1class Solution {
2    public int longestPalindrome(String s) {
3       Set<Character> set = new HashSet<>();
4    int res = 0;
5       for(char c: s.toCharArray()){
6        if(set.contains(c)){
7            set.remove(c);
8            res += 2;
9        }else{
10            set.add(c);
11        }
12       }
13
14       if(!set.isEmpty()){
15        res++;
16       }
17       return res;
18    }
19}