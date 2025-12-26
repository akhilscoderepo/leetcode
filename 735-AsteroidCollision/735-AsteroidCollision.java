// Last updated: 26/12/2025, 16:00:34
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int a: asteroids){
            if(a>0){
                stack.push(a);
            }else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(a) ){
                    stack.pop();
                }
                
                if(stack.isEmpty() || stack.peek()<0){
                    stack.push(a);
                }
                if(!stack.isEmpty() && stack.peek()==Math.abs(a)){
                    stack.pop();
                }
                
            }
                
        }
        
        int[] res = new int[stack.size()];
        int i=0;
        for(int b: stack){
            res[i]    =b;
            i++;
        }
        
        return res;
    }
}

//+ve right side travelling
//-ve left side travveling

//[<- ,<-,->,->]
//[->,->,<-]
//[->,<-]
//[<-,->]
//if -ve number is to the bottom of stack ignore it
//just push
//negative, positive
//negative, negative
//positive, positive
//calc
//positive, negative