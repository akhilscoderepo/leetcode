// Last updated: 26/12/2025, 15:59:41
class Solution {
    public int numSteps(String s) {
        int count=0;
        int carry=0;
        
        for(int i=s.length()-1;i>=1;--i){
            if(s.charAt(i)-'0'+carry==1){
                carry=1;
                count+=2;
            }else{
                count++;
            }    
        }
        return count+carry;
    }
}

