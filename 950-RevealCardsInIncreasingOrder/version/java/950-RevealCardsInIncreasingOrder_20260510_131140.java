// Last updated: 10/05/2026, 13:11:40
1class Solution {
2       public int[] deckRevealedIncreasing(int[] deck) {
3        int n = deck.length;
4        Arrays.sort(deck);
5        Queue<Integer> q = new LinkedList<>();
6        for (int i = n - 1; i >= 0; --i) {
7            if (q.size() > 0) q.add(q.poll());
8            q.add(deck[i]);
9        }
10        int[] res = new int[n];
11        for (int i = n - 1; i >= 0; --i) {
12            res[i] = q.poll();
13        }
14        return res;
15    }
16}