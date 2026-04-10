// Last updated: 10/04/2026, 12:33:04
1class Solution {
2    public int longestPalindrome(String s) {
3        Map<Character, Integer> map = new HashMap();
4
5        for(char c: s.toCharArray()){
6            map.put(c, map.getOrDefault(c,0)+1);
7        }
8
9        int result = 0;
10        boolean odd = false;
11        for(int k: map.values()){
12            if(k%2==0){
13                result += k;
14            }else{
15                result += k-1;
16                odd = true;
17            }
18        }
19
20        return odd? result+1 : result;
21    }
22}