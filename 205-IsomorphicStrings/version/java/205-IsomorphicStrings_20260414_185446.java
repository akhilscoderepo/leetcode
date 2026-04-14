// Last updated: 14/04/2026, 18:54:46
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        Map<Character, Integer> sBucket = new HashMap();
4        Map<Character, Integer> tBucket = new HashMap();
5
6        for(int i = 0; i<s.length(); i++){
7            char sc = s.charAt(i);
8            char tc = t.charAt(i);
9            sBucket.putIfAbsent(sc, i);
10            tBucket.putIfAbsent(tc, i);
11
12            if(sBucket.get(sc) != tBucket.get(tc)){
13                return false;
14            }
15        }
16
17
18        return true;
19    }
20}