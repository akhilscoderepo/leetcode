// Last updated: 26/12/2025, 15:59:13
class Solution {
    public int[] decode(int[] encoded) {
        int result[] = new int[encoded.length+1];
        int first=0;
        int n=0;
       
        
        
        for(int i=1;i<=result.length;i++){
            n^=i;
            
        }
        
        for(int i=1;i<encoded.length;i=i+2){
            first^=encoded[i];
        }
       
        first=first^n;
        result[0]=first;
        for(int i=1;i<result.length;i++){
            result[i]=result[i-1]^encoded[i-1];
        }
        
        
        
       
        return result;
    }
}


