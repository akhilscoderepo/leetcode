// Last updated: 26/12/2025, 16:02:11
class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<String>();
        
        for(String s: pathArray){
            if(!stack.isEmpty() && s.equals("..")){
                stack.pop();
            }else if(!s.equals("..") && !s.equals(".") && !s.equals("") && !s.equals(" ")){
                stack.push(s);
            }
        }
        
        result.append("/");
        for(String p: stack){
            result.append(p);
            result.append("/");
        }
        
        if(result.length()==1){
            return result.toString();
        }
        
        return result.deleteCharAt(result.length()-1).toString();
    }
}