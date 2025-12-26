// Last updated: 26/12/2025, 16:01:43
class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<Integer>();
        int first, second =0;
        
        for(String s: tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(s.equals("-")){
                second=stack.pop();
                first=stack.pop();
                stack.push(first-second);
            }else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("/")){
                 second=stack.pop();
                first=stack.pop();
                stack.push(first/second);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
    
   
}


//   Stack<Integer> stack = new Stack<Integer>();
//         int first = 0;
//         int second=0;
        
//         for(String s: tokens){
//             char c = s.charAt(0);
        
//                 if(c=='+'){
//                     stack.push(stack.pop()+stack.pop());
//                  
//                 }else if(c=='*'){
//                     stack.push(stack.pop()*stack.pop());
//                    
//                 }else if(c=='-'){
//                     second=stack.pop();
//                     first=stack.pop();
//                     stack.push(first-second);
//                    
//                 }else if(c=='/'){
//                      second=stack.pop();
//                     first=stack.pop();
//                     stack.push(first/second);
//                    
//                 }else{
//                     stack.push((int)c-'0');
//                 }
    
            
                        
//         }
//         return stack.pop();

