// Last updated: 26/12/2025, 16:00:29
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result=0;
 
        
        for(char each: stones.toCharArray()){
            if(jewels.indexOf(each)!=-1){
                result++;     
            }
            
        }
        
        return result;
        
    }
}