// Last updated: 26/12/2025, 16:02:24
class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack= new Stack();
        
        if(s.length()%2!=0){
            return false;
        }
        for(char c: s.toCharArray()){
            if(c=='{'){
                stack.push('}');
            }else if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.size()==0 || c!= stack.pop()){
                return false;
            }
            
        }
        return stack.empty();
    }
}