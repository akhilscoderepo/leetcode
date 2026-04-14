// Last updated: 14/04/2026, 12:51:26
1class Solution {
2    public int repeatedStringMatch(String a, String b) {
3            Set<Character> set = new HashSet<>();
4        for(char c: a.toCharArray())
5            set.add(c);
6        for(char c: b.toCharArray())
7            if(!set.contains(c)) return -1;
8        
9        int count = 1;
10        String newA = a;
11        while(newA.length() < b.length()){
12            newA += a;
13            count++;
14        }
15
16        // b substring (pattern) exist in newA
17        if(matchPattern(newA, b)) return count;
18        else if(matchPattern(newA+""+a, b)) return count+1;    
19        return -1;
20    }
21
22     private boolean matchPattern(String a, String b){
23        // if(rabinKarp(a, b)) return true;
24        if(KMP(a, b)) return true;
25        return false;
26    }
27    private boolean KMP(String string, String pattern){
28        if(string.length() < pattern.length()) return false;
29        int[] lps = new int[pattern.length()];
30        fillLPS(pattern, lps);
31        int i = 0, j = 0;
32        
33        while(i<string.length()){
34            if(string.charAt(i) == pattern.charAt(j)){
35                i++;j++;
36            }
37            if(j == pattern.length()){
38                j = lps[pattern.length()-1];
39                return true;
40            }else if(i < string.length() && string.charAt(i) != pattern.charAt(j)){
41                if(j == 0) i++;
42                else j = lps[j - 1];
43            }
44        }
45        return false;
46    }
47    
48    private void fillLPS(String s, int[] lps){
49        lps[0] = 0;
50        int j = 0, i = 1;
51        while(i < s.length()){
52            if(s.charAt(i) == s.charAt(j)){
53                j++;
54                lps[i] = j;
55                i++;
56            }else{
57                if(j == 0){
58                    lps[i] = 0;
59                    i++;
60                }else j = lps[j - 1]; 
61            }
62        }
63    }
64}