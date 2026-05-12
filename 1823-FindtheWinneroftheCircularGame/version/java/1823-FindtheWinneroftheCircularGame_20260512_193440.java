// Last updated: 12/05/2026, 19:34:40
1class Solution {
2    public int findTheWinner(int n, int k) {
3        Queue<Integer> queue = new LinkedList();
4
5        for(int i =1; i<=n; i++){
6            queue.offer(i);
7        }
8
9        int result = 0;
10
11        for(int i =0; i<n;i++){
12            for(int j=0;j<k-1;j++){
13                queue.offer(queue.poll());
14            }
15            result = queue.poll();
16        }
17        return result;
18    }
19}