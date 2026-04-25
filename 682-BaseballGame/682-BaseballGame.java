// Last updated: 25/04/2026, 14:53:41
class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque();

        for(String c : operations){

                if(c.equals("C") && !stack.isEmpty()){
                    stack.pop();
                }else if(c.equals("D") && !stack.isEmpty()){
                    stack.push(stack.peek()*2);
                }else if(c.equals("+") && !stack.isEmpty()){
                    int last = stack.pop();
                    int lastTwo = stack.isEmpty()?0:stack.peek();
                    stack.push(last);
                    stack.push(last+lastTwo);
                }else{
                    stack.push(Integer.valueOf(c));
                }
            
        }

    
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}