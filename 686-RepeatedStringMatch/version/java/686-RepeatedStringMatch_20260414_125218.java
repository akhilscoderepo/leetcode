// Last updated: 14/04/2026, 12:52:18
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
23         if(rabinKarp(a, b)) return true;
24        //if(KMP(a, b)) return true;
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
64
65    private boolean rabinKarp(String a, String b){
66        if(a.length() < b.length()) return false;
67        long patternHash = 0, hash = 0, prime = 7, MOD = (int)(1e9+7);
68        int i = 0, j = 0;
69        
70        // Generating pattern hash
71        while(i<b.length())
72            patternHash = ((patternHash * prime) % MOD + (int)(b.charAt(i++))) % MOD;
73        
74        // Generating initial hash of initial b.length() characters of a
75        i = 0;
76        while(i<b.length())
77            hash = ((hash * prime) % MOD + (a.charAt(i++))) % MOD;
78        
79        if(patternHash == hash && b.equals(a.substring(0, i))) return true;
80        while(i < a.length()){
81            // Removing first value of hash
82            hash = hash - ((long)(a.charAt(j++)) * (long)(Math.pow(prime, b.length()-1)));
83            // Adding new value at the end and generating new Hash
84            hash = ((hash * prime) % MOD + (a.charAt(i++))) % MOD;
85            // if below condition return true -> Pattern matched!
86            if(patternHash == hash && b.equals(a.substring(j, i))) return true;
87        }
88        return false;
89    }
90}