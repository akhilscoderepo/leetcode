// Last updated: 26/12/2025, 16:01:32
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count=0;
        if(left==0){
            return 0;
        }
        
       while(left!=right){
            left=left>>1;
           right=right>>1;
           count++;
       }
        
        return right<<count;
        
    }
}


    
   