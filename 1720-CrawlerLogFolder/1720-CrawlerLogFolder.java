// Last updated: 26/12/2025, 15:59:24
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        
        for(String s: logs){
            if(s.equals("../") && !stack.isEmpty()){
                stack.pop();
            }else if(!s.equals("./") && !s.equals("../")){
                stack.push(s);
            }
           
        }
        return stack.size();
    }
}