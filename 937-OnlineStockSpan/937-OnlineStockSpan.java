// Last updated: 26/12/2025, 16:00:17
class StockSpanner {
    
    Stack<int[]> stack = null;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int val =1;
            while(!stack.isEmpty() && stack.peek()[0]<=price){
                val +=stack.peek()[1];
                stack.pop();
            }
        stack.push(new int[]{price,val});
        
        return val;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// int span = 1;
//         while (!s.isEmpty() && price >= s.peek()[0]) { // If the current price is greater than stack peek.
//             span += s.peek()[1];
//             s.pop();
//         }
//         s.push(new int[]{price, span});
//         return span;