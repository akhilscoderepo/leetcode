// Last updated: 12/04/2026, 20:51:29
1class Solution {
2    public void findSecretWord(String[] words, Master master) {
3        List<String> candidates = new ArrayList<>(Arrays.asList(words));
4        
5        for (int i = 0; i < 30; i++) {  // allowedGuesses ≤ 30
6            String guess = chooseWord(candidates);
7            int matches = master.guess(guess);
8            if (matches == 6) return; // found the secret
9            
10            List<String> nextCandidates = new ArrayList<>();
11            for (String w : candidates) {
12                if (matchCount(w, guess) == matches) {
13                    nextCandidates.add(w);
14                }
15            }
16            candidates = nextCandidates;
17        }
18    }
19    
20    // Choose word using minimax strategy
21    private String chooseWord(List<String> candidates) {
22        int minMaxGroup = Integer.MAX_VALUE;
23        String bestWord = candidates.get(0);
24        
25        for (String w : candidates) {
26            Map<Integer, Integer> groups = new HashMap<>();
27            for (String v : candidates) {
28                int m = matchCount(w, v);
29                groups.put(m, groups.getOrDefault(m, 0) + 1);
30            }
31            int maxGroup = Collections.max(groups.values());
32            if (maxGroup < minMaxGroup) {
33                minMaxGroup = maxGroup;
34                bestWord = w;
35            }
36        }
37        return bestWord;
38    }
39    
40    private int matchCount(String w1, String w2) {
41        int count = 0;
42        for (int i = 0; i < w1.length(); i++) {
43            if (w1.charAt(i) == w2.charAt(i)) {
44                count++;
45            }
46        }
47        return count;
48    }
49}