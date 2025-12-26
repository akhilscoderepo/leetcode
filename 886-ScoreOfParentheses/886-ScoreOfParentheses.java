// Last updated: 26/12/2025, 16:00:21
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
       
        int innerCount=0;
        
        for(char c: s.toCharArray()){
            
            if(c=='('){
                stack.push(innerCount);
                innerCount=0;
            }else if(c==')' && !stack.isEmpty()){
                innerCount = stack.pop()+Math.max(innerCount*2, 1);
                
            }
        }
       
        return innerCount;
    }
}

// (()(()))
//

// ()(())

