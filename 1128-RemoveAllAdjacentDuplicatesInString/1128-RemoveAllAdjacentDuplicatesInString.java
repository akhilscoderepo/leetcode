// Last updated: 26/12/2025, 16:00:06
class Solution {
    public String removeDuplicates(String s) {
        StringBuffer result = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(stack.isEmpty() || stack.peek()!=c){
                stack.push(c);
            }else if(stack.peek()==c){
                stack.pop();
            }
        }
        
        for(char c: stack){
            result.append(c);
        }
        
        return result.toString();
    }
}