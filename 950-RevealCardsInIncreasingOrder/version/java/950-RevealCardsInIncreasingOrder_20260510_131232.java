// Last updated: 10/05/2026, 13:12:32
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int[] res = new int[deck.length];
5        boolean[] filled = new boolean[deck.length];
6        boolean skip = false;
7        int i = 0, j = 0;
8        while(i < deck.length) {
9            if(filled[j]) {
10                j = (j + 1) % deck.length;
11                continue;
12            }
13
14            if(skip) {
15                skip = false;
16            } else {
17                res[j] = deck[i++];
18                filled[j] = true;
19                skip = true;
20            }
21            j = (j + 1) % deck.length;
22        }
23
24        return res;
25    }
26}