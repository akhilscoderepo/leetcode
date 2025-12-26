// Last updated: 26/12/2025, 15:59:11
class Solution {
    public int[] decode(int[] encoded, int first) {
        int result[]=new int[encoded.length+1];
        result[0]=first;
        
        for(int i=0;i<encoded.length;i++){
            result[i+1]=encoded[i]^result[i];    
        }
        return result;
    }
}

