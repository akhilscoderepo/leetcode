// Last updated: 10/05/2026, 13:10:57
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        int n= deck.length;
4        Arrays.sort(deck);
5        Queue<Integer> q= new LinkedList<>();
6        for (int i=0; i<n; i++) q.add(i);
7        int[] res= new int[n];
8        for (int i=0; i<n; i++){
9            res[q.poll()]=deck[i];
10            q.add(q.poll());
11        }
12        return res;
13    }
14}