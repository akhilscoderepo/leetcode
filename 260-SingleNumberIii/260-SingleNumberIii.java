// Last updated: 26/12/2025, 16:01:13
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        
        for(int n: nums){
            xor^=n;
        }
        
        int firstBit = xor&(-xor);
        int a=0;
        int b=0;
        
        for(int n: nums){
            if((n & firstBit)>0){
                a^=n;
            }else{
                b^=n;
            }
        }
        return new int[]{a,b};
    }
}

        
        
    




    
    
    
    