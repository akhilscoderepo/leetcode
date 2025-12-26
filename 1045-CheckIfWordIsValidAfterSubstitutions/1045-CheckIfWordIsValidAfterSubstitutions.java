// Last updated: 26/12/2025, 16:00:11
class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(c=='c'){
                if(stack.isEmpty() || stack.pop()!='b')return false;
                if(stack.isEmpty() || stack.pop()!='a')return false;
            }else{
                stack.push(c);    
            }
            
        }
     return stack.isEmpty();
}
}
//string ops
//    do{
//         s=s.replaceAll("abc","");
//     }while(s.contains("abc"));
    
//     if(s.length()==0){
//         return true;
//     }
    
//     return false;

//stack