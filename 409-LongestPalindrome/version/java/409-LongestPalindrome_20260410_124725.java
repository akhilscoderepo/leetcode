// Last updated: 10/04/2026, 12:47:25
1class Solution {
2    public int longestPalindrome(String s) {
3        Map<Character, Integer> map = new HashMap();
4        int oddCount = 0;
5
6        for(char c: s.toCharArray()){
7            map.put(c, map.getOrDefault(c,0)+1);
8
9            if((map.get(c) %2) == 1){
10                oddCount++;
11            }else{
12                oddCount--;
13            }
14        }
15
16        return oddCount>0 ? s.length()-oddCount+1 : s.length();
17    }
18}