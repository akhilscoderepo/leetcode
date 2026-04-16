// Last updated: 16/04/2026, 19:45:35
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3      int[] charsInP = new int[26];
4        calculateFreq(p, charsInP);
5        int len1, len2;
6        len1 = s.length();
7        len2 = p.length();
8        List<Integer> res = new ArrayList<>();
9        for(int i=0; i<len1 && i+len2<=len1; i++){
10            String subs = s.substring(i, i+len2);
11            int[] charsInSubs = new int[26];
12            calculateFreq(subs, charsInSubs);
13            if(equalFreq(charsInP, charsInSubs)){
14                res.add(i);
15            }
16        }
17        return res;
18    }
19    
20    private void calculateFreq(String s, int[] chars){
21        for(char ch : s.toCharArray()){
22            chars[ch-'a']++;
23        }
24    }
25    private boolean equalFreq(int[] chars1, int[] chars2){
26        for(int i=0; i<26; i++){
27            if(chars1[i]!=chars2[i]){
28                return false;
29            }
30        }
31        return true;
32    }
33    
34}