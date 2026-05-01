// Last updated: 01/05/2026, 15:00:07
1class StockSpanner {
2
3    Deque<int[]> stack = null;
4
5    public StockSpanner() {
6        stack = new ArrayDeque();
7    }
8    
9    public int next(int price) {
10        int res = 1;
11            while(!stack.isEmpty() && price >= stack.peek()[0]){
12                res += stack.pop()[1];
13            }
14            stack.push(new int[]{price, res});
15            return res;
16        
17
18    }
19}
20
21/**
22 * Your StockSpanner object will be instantiated and called as such:
23 * StockSpanner obj = new StockSpanner();
24 * int param_1 = obj.next(price);
25 */