// Last updated: 26/12/2025, 16:00:16
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int result[] = new int[deck.length];
        Queue<Integer> q= new LinkedList<Integer>();
         
       for(int i=0;i<deck.length;i++)q.add(i);
        
        for(int j=0;j<deck.length;j++){
            result[q.poll()]=deck[j];
            q.add(q.poll());
        }
        return result;
    }
}
