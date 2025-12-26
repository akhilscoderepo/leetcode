// Last updated: 26/12/2025, 16:00:05
class Solution {
    public boolean parseBoolExpr(String s) {
Stack<Boolean> stack = new Stack<Boolean>();
        Stack<Character> op = new Stack<Character>();
        boolean result =true;
        
        for(char c: s.toCharArray()){
            if(c=='t'){
                stack.push(true);
            }else if(c=='f'){
                stack.push(false);
            }else if(c=='('){
                stack.push(null);
            }else if(c==')'){
                char operator = op.pop();
                boolean res=true;
                if(operator =='|'){
                    res=false;
                }
                
                while (!stack.isEmpty() && stack.peek() != null) {
				if (operator == '|') 
					res |= stack.pop();
				else if (operator == '&')
					res &= stack.pop();
				else if (operator == '!')
					res = !stack.pop(); 
			}
                stack.pop();
                stack.push(res);
                
            }else if(c==','){
                continue;
            }else {
                op.push(c);
            }
                
        }
        return stack.peek();    
    }
}

// if (expression == null || expression.length() == 0) return false;

// 	Stack<Character> ops = new Stack<>();
// 	Stack<Boolean> operands = new Stack<>();

// 	for (int i = 0; i < expression.length(); i++) {
// 		char ch = expression.charAt(i);

// 		if (ch == 'f')
// 			operands.push(false);
// 		else if (ch == 't')
// 			operands.push(true);
// 		else if (ch == '(')
// 			operands.push(null);
// 		else if (ch == ')') {
// 			char operator = ops.pop();

// 			boolean res = true;
// 			if (operator == '|')
// 				res = false;

// 			while (!operands.isEmpty() && operands.peek() != null) {
// 				if (operator == '|') 
// 					res |= operands.pop();
// 				else if (operator == '&')
// 					res &= operands.pop();
// 				else if (operator == '!')
// 					res = !operands.pop(); 
// 			}
// 			operands.pop();
// 			operands.push(res);

// 		} else if (ch == ',') 
// 			continue;
// 		else {
// 			ops.push(ch);
// 		}
// 	}
// 	return operands.peek();





