// Last updated: 26/12/2025, 15:59:48
class Solution {
    
    public int numberOfSteps(int a) {
        int count=0;
        
        while(a>0){
        if(a%2==0){
            a = a/2;
            count++;
        }else{
            a=a-1;
            count++;
        }
            
        }
        return count;
    }
    
}