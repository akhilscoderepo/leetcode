// Last updated: 26/12/2025, 15:59:57
class Solution {
    public int balancedStringSplit(String s) {
        int balance =0, result=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                --balance;
            }else{
                balance++;
            }
            if(balance==0){
            result++;
        }
        }
        
       return result; 
    }
}