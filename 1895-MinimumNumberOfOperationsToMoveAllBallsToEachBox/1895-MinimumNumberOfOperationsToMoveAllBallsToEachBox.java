// Last updated: 26/12/2025, 15:59:10
class Solution {
    public int[] minOperations(String boxes) {
        int length=boxes.length();
        int result[] = new int[length];
        
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(boxes.charAt(j)=='1'){
                result[i]+=Math.abs(j-i);     
                }
               
            }
        }
        
        return result;
    }
}