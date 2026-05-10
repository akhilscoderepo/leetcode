// Last updated: 10/05/2026, 13:09:31
1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        Arrays.sort(deck);
4        int[] result = new int[deck.length];
5        Deque<Integer> queue = new LinkedList();
6
7        for(int k = 0; k<deck.length/2; k++){
8            int temp = deck[k];
9            deck[k] = deck[deck.length-k-1];
10            deck[deck.length-k-1] = temp;
11        }
12
13
14        for(int i =0; i<deck.length; i++){
15            int current = deck[i];
16
17            if(!queue.isEmpty()){
18                int last = queue.pollLast();
19                queue.offerFirst(last);
20                queue.offerFirst(current);
21            }else{
22                queue.offerLast(current);
23            }
24        }
25
26
27        int index = 0;
28        while(!queue.isEmpty()){
29            result[index++] = queue.pollFirst();
30        }
31       return result;
32    }
33}