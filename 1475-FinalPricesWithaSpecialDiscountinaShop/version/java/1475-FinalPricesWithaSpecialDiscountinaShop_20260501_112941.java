// Last updated: 01/05/2026, 11:29:41
1class Solution {
2    public int[] finalPrices(int[] prices) {
3        Deque<Integer> stack = new ArrayDeque();
4      
5        for(int i =0; i<prices.length; i++){
6            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()]){
7                int index = stack.pop();
8                int num = prices[index]-prices[i];
9                prices[index] = num;
10            }
11            stack.push(i);
12        }
13        return prices;
14    }
15}