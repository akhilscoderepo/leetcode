// Last updated: 26/12/2025, 15:59:23
class Solution {
    public int maxDepth(String s) {
       Stack<Character> stack = new Stack<Character>();
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='(' || c==')'){
                if(stack.isEmpty() || c=='('){
                    stack.push(c);
                }else if(c==')' && stack.peek()=='('){
                    count=Math.max(count,stack.size());
                    stack.pop();
                
            }    
            }
            
        }
        
        return count;
        
    }
}


// if string is empty
// if string doesn't include '(' or ')'
// can we use recurssion? beacuse the 2nd and 3rd statements talks about combinations of vps's
// lets says s= ((A)) = depth of (A)+1


// (1+()()+2
 



