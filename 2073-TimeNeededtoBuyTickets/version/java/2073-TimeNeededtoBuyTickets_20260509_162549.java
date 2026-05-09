// Last updated: 09/05/2026, 16:25:49
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3       int time = 0;
4      Queue<Integer> queue = new LinkedList();
5
6      for(int i =0; i<tickets.length; i++){
7        queue.offer(i);
8      }
9      
10   
11     while(tickets[k]>0){
12        int current = queue.poll();
13        tickets[current]--;
14        time++;
15        if(tickets[current] >0) queue.offer(current);
16     }
17
18     return time;
19    }
20}