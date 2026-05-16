// Last updated: 16/05/2026, 12:13:35
1class Solution {
2    public int findMaxValueOfEquation(int[][] points, int k) {
3        Deque<Integer> queue = new LinkedList();
4        int sum = Integer.MIN_VALUE;
5
6        for(int i =0; i< points.length; i++){
7            int x = points[i][0];
8            int y = points[i][1];
9
10            while(!queue.isEmpty() && (x-points[queue.peekFirst()][0]) >k){
11                queue.pollFirst();
12            }
13
14            if(!queue.isEmpty()){
15                sum = Math.max(sum, points[queue.peekFirst()][1]-points[queue.peekFirst()][0]+x+y);
16            }
17
18            
19            while(!queue.isEmpty() && points[queue.peekLast()][1]-points[queue.peekLast()][0] < y-x ){
20                queue.pollLast();
21            }
22            queue.offerLast(i);
23        }
24
25        return sum;
26    }
27}