// Last updated: 26/12/2025, 16:00:37
class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean firstFlip=true;
        int previous=0;
        
        while(n>0){
            if(firstFlip){
               previous=n&1;
                firstFlip=false;
                n>>=1;
            }else{
                if((n&1)!=previous){
                    previous=previous==1?0:1;
                    n>>=1;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}

