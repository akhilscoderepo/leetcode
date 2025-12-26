// Last updated: 26/12/2025, 15:59:25
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
           if(stack.isEmpty()){
               stack.push(s.charAt(i));
           }else if(!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i))==32){
               stack.pop();
               
           }else{
               
               stack.push(s.charAt(i));
           }
            
        }
       
        if(stack.isEmpty()){
            return "";
        }else{
            for(char c: stack){
                result.append(c);
            }
        }
        return result.toString();
    }
}


//leEeetcode
//leetcode

//if stack is empty push it
//if stack is not empty && peek==charAt-26 pop it
//push it